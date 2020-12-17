package 알고리즘공부;

import java.awt.FocusTraversalPolicy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class swea여행총여행거리 {
	
	static int[] dr = {0,-1,-1,0,1,1, 1, 0,-1};
    static int[] dc = {0, 0, 1,1,1,0,-1,-1,-1};
	static int T,N;
	static int[][] map;
    static int Sr,Sc;
    
	
    public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.setIn(new FileInputStream("Test4.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			
			N = sc.nextInt();
			map = new int[N+1][N+1];
			
			Sr = sc.nextInt();
			Sc = sc.nextInt();
			
			
			int trapN = sc.nextInt();
			
			for (int i = 0; i < trapN; i++) {
				int trapR = sc.nextInt();
				int trapC = sc.nextInt();
				map[trapR][trapC] = 1;
			}
			
			//print(map);
			
			int moveN = sc.nextInt();
			int[] dir = new int[moveN];
			int[] step = new int[moveN];
			
			for (int i = 0; i < moveN; i++) {
				dir[i] = sc.nextInt();
				step[i] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(dir));
//			System.out.println(Arrays.toString(step));
			
			int count = 0;
			Lable:
				for (int i = 0; i < moveN; i++) {
				for (int j = 0; j < step[i]; j++) { // 이동이니깐 for하나 더 들어감
					Sr += dr[dir[i]];
					Sc += dc[dir[i]];
					if(Sr >= 1 && Sr <= N && Sc>=1 && Sc <=N && map[Sr][Sc] != 1) {
						count++;
					} else {
						break Lable;
					}
				}
				
			}
			System.out.println("#" + tc + " " + count);
		}
		
		
		
	}


	private static void print(int[][] map2) {
		// TODO Auto-generated method stub
		for (int i = 1; i < map2.length; i++) {
			for (int j = 1; j < map2.length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
