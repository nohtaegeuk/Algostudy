package 아이엠;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 점프사방 {

	static int[] dr = {0,0,1,0,-1};
	static int[] dc = {0,1,0,-1,0};
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("점프사방.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int Y = sc.nextInt(); // 세로줄
			int X = sc.nextInt(); // 가로줄
			int N = sc.nextInt(); // 참가자수
			int[][] map = new int[Y+1][X+1]; // 맵 한칸 더 크게 입력
			
			
			for (int i = 1; i < Y+1; i++) {
				for (int j = 1; j < X+1; j++) {
					map[i][j] = sc.nextInt(); // 입력받기
				}
			}
			
			int[] start_x = new int[N];
			int[] start_y = new int[N];
			int[] times = new int[N];
			
			for (int i = 0; i < N; i++) {
				start_x[i] = sc.nextInt();
				start_y[i] = sc.nextInt();
				times[i] = sc.nextInt();
			}
			
			
			int trap = sc.nextInt();
			int[] trap_x = new int[trap];
			int[] trap_y = new int[trap];
			
			for (int i = 0; i < trap; i++) {
				trap_x[i] = sc.nextInt();
				trap_y[i] = sc.nextInt();
			}
			
			
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				int x = start_x[i];
				int y = start_y[i];
				boolean flag  = true;
				
				
				
				for (int j = 0; j < times[i]; j++) {
					int dir = map[x][y] / 10;
					int cansu = map[x][y] % 10;
					
					x += dr[dir] * cansu;
					y += dc[dir] * cansu;
					
					if(x>=0 && x<Y +1 && y>=0 && y<X +1 ) {
						for (int j2 = 0; j2 < trap; j2++) {
							if(x == trap_x[j2] && y == trap_y[j2]) {
								flag = false;
								break;
							}
						}
						
					} else {
						flag = false;
						break;
					}
				
					
					
				
				
				}
				
				if(flag == false) {
					sum = sum -1000;
				} else {
					sum = sum + map[x][y]*100 -1000;
				}
			}
			
			
			
			System.out.println("#" + tc + " " + sum);
		}
		
	}

}
