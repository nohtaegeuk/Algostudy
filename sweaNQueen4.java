package 알고리즘공부;

import java.util.Scanner;
import java.io.FileInputStream;

class sweaNQueen4
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

        for(int t = 1; t <= T; t++)
        {
            arr = new int[15][15]; // 초기화
            totalCount = 0; // 초기화
            N = 0; // 초기화
            
            N = sc.nextInt();
            for (int i = 0; i < N; i++) { // 시작하는 곳이 첫번째 행인경우만 완전탐색을한다..? 아하 첫번째 행에 삽입이 안되면 어차피 실패. 그래서 요렇게함
				arr[0][i] = 1; // 어쩃든 0, i에는 무조건 1일 들어가야되고 아니면 실패임.
				nqueen(1,0,1); // 완전탐색으로 첫번째 열에는 1이 들어갔고, 그 다음 열이 1,0부터 완전탐색을 다시 시작함.
				arr[0][i] = 0; // 그리고 세번째 숫자는 nqueen count임. 첫번째 열에 1이 들어갔기 때문에 무조건 1을 넣어줌.
								// 백트래킹을 위해 만약 실패했을 경우, 다시 0으로 만들어줌.
			}
            
            System.out.println("#" + t + " " + totalCount);
        	
        }
    }

	private static void nqueen(int i, int j, int queenCount) {
		// TODO Auto-generated method stub
		
		if(i == N) {
			totalCount++; // 만약에 마지막 열까지 퀸을 놓는다면, 그건 성공임. 그래서 tatalCount를 1늘려주고 끝내는 것.
			return; // return을 해주는 이유는, 처음에 배열을 크게 만들어서 그 밑으로 더이상 탐색하지 않도록 하는 것.
		}
		
		Boolean possible = isValid(i,j); // Boolean을 이용해서 놓을 수 있는지 없는지 확인 하는 것.
		
		if(possible == true) {
			arr[i][j] = 1; // 이거는 이전 열을 성공시키고, 그 다음열을 검색하는건데, 1을 넣어보는 거야(try해보는 것) 
			queenCount++; // 놓고 다음열을 탐색하기 전에 queenCount를 더해줘야댐
			
			nqueen(i+1, 0 , queenCount); // 이거는 윗 줄에서 퀸을 놓고, 다음 행으로 넘어가는거임.
			
			arr[i][j] = 0; // 이거는 실패했을 경우 백트래킹을 위해 다시 0으로 만들어주고
			queenCount--; // 실패했으니깐 이것도 1을 빼줌.
			
			if(j != N-1) {
				nqueen(i, j+1 , queenCount);
			} 
		}else {
				if(j != N-1) {
					nqueen(i, j+1, queenCount);
				}
			}
		}
		
	private static Boolean isValid(int i, int j) {
		// TODO Auto-generated method stub
		for (int a = 0; a < N; a++) {
			if(arr[a][j] == 1) { // 이게뭐냐면 0, ~ 여기를 검색하는건데, 같은 줄에는 절대 놓을 수 었으니 검색 안해도되고
				return false; // 바로 false로 리턴해줌.
			}
		}
		
		for (int a = 0; a < N; a++) { // 이거는 대각선 검사
			for (int b = 0; b < N; b++) {
				if(arr[a][b] == 1) {
					if(Math.abs(a-i) == Math.abs(b-j)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}

    
}