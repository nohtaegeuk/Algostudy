package 알고리즘공부;

import java.util.Scanner;
import java.io.FileInputStream;

class sweaNQueen3
{
    static int arr[][];
    static int totalCount;
    static int N;

    public static void main(String args[]) throws Exception
    {
        System.setIn(new FileInputStream("nqueen.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            // 초기화
            arr = new int[15][15];
            totalCount = 0;
            N = 0;
            // 초기화

            N = sc.nextInt();
            for(int i = 0; i < N; i++) { // 시작하는 곳이 첫번째 행인경우만 완전탐색한다. 첫번째 행에 삽입안될경우 실패이기때문.
                arr[0][i] = 1;
                nqueen(1, 0,1); //첫번재 행은 1로 채웠으니 두번째 행은 무조건 (1,0)을 확
                arr[0][i] = 0;
            }
            System.out.println("#" + test_case + " " + totalCount);
        }
    }

    public static void nqueen(int i, int j, int queenCount) {

        if(i == N) { // 다 돌고 그 아래 행으로 갔을경우, 즉 nxn 을 벗어나 아래칸
            totalCount++; // 맨 아래칸까지 갔다는 것은 모든 행에 1개씩 퀸이 배치되었다는 얘기임. 즉 4x4일때 4개가 배치되었음.
            return;       // return을 해주지 않으면 그 아래가 계속 실행되어 버그를 발생시킨다.
        }
        Boolean possile = isValid(i, j);

        if(possile == true) {
            arr[i][j] = 1; queenCount++;

            nqueen(i+1, 0, queenCount); //퀸이 배치가 됐을경우 해당 행에는 퀸이 배치될수 없음으로 다음 행으로 넘어감.

            arr[i][j] = 0; queenCount--;

            if(j != N-1) {                   //퀸이 배치가 가능하더라도 배치하는 경우도 계산하고 배치하지 않고 다른곳에 배치하는 경우도 고려해야한다!!!
                nqueen(i, j + 1, queenCount);
            }
        } else {
            if(j != N-1) {
                nqueen(i, j + 1, queenCount);
            }
        }
    }

    public static Boolean isValid(int i, int j){
        for(int a = 0; a < N; a++) { // 세로에 1이 있다면, 가로는 확인할 필요 없
            if(arr[a][j] == 1) {
                return false;
            }
        }

        for(int a = 0; a < N; a++) {    // 모든 배열을 검사해
            for (int b = 0; b < N; b++) {
                if (arr[a][b] == 1) {   // 1이 있는경우
                    if (Math.abs(a - i) == Math.abs(b - j)) { //현재있는 값과 대각선에 있다면
                        return false;
                    }
                }
            }
        }
        return true;
    }
}