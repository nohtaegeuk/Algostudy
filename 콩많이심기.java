package 알고리즘swea;

import java.io.FileInputStream;
import java.util.Scanner;

public class 콩많이심기 {
    static int N, M, cnt;
    static int[][] map;

    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("콩많이심기.txt"));
    	Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            // 가로길이 N, 세로길이 M (1 ≤ N, M ≤ 1000)
            N = sc.nextInt();
            M = sc.nextInt();

            map = new int[M][N];
            cnt = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    solve(i, j);
                }
            }
            System.out.println("#"+tc+" "+cnt);
        }
    }

    private static void solve(int i, int j) {

        int[] dx = { -2, 2, 0, 0 };
        int[] dy = { 0, 0, -2, 2 };

        boolean flag = true;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (range(nx, ny)) { 
                if (map[nx][ny] == 1) { 
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            map[i][j] = 1;
            cnt++; 
        }

    }

    static boolean range(int x, int y) {
        if (0 <= x && x < M && 0 <= y && y < N)
            return true;
        return false;
    }
}
