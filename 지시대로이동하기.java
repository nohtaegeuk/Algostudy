package 백준;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 지시대로이동하기 {

	static int[] dr = {0,0,1,0,-1};
	static int[] dc = {0,1,0,-1,0};
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("지시대로이동하기.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int person = sc.nextInt();
			int sum = 0;
			int[][] map = new int[row+1][col+1];
			
			for (int i = 1; i < row+1; i++) {
				for (int j = 1; j < col+1; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
		
			int[] per_x = new int[person];
			int[] per_y = new int[person];
			int[] times = new int[row*col];
			
			for (int i = 0; i < person; i++) {
				per_x[i] = sc.nextInt();
				per_y[i] = sc.nextInt();
				times[i] = sc.nextInt();
			}
			
			
			for (int i = 0; i < person; i++) {
				int x = per_x[i];
				int y = per_y[i];
				boolean flag = true;
				
				for (int j = 0; j < times[i]; j++) {
					
					int dir = map[x][y] / 10;
					int cansu = map[x][y] % 10;
					
					x += dr[dir] * cansu;
					y += dc[dir] * cansu;
					
					if( x>=0 && x<row +1 && y>=0 && y<col +1) {
						
					} else {
						flag = false;
						break;
					}
				}
				
				if(flag == false) {
					sum = sum -1000;
				} else {
					sum = sum + map[x][y] * 100 -1000;
				}
				
			}
			
			
			System.out.println("#" + tc + " " + sum);
			
				
		}
	}

}
