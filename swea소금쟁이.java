package 归霖;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 家陛里捞 {
	static int[] dx = {0,-1,1,0,0};
	static int[] dy = {0,0,0,-1,1};
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("家陛里捞.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[][] pond = new int[N][N];
			
			int number = sc.nextInt();
			
			int[] start_x = new int[number];
			int[] start_y = new int[number];
			int[] dir = new int[number];
			
			for (int i = 0; i < number; i++) {
				start_x[i] = sc.nextInt();
				start_y[i] = sc.nextInt();
				dir[i] = sc.nextInt();
			}
			

			int survival = 0;
			int[] cansu = {3,2,1};
			
			for (int i = 0; i < number; i++) {
				int cur_x = start_x[i];
				int cur_y = start_y[i];
				boolean flag = true;
				
				for (int j = 0; j < 3; j++) {
					cur_x += dx[dir[i]] * cansu[j];
					cur_y += dy[dir[i]] * cansu[j];
					
					if(cur_x>=0 && cur_x<N && cur_y>=0 && cur_y<N) {
						if(pond[cur_x][cur_y] == 1) {
							flag = false;
							break;
						}
					} else {
						flag = false;
						break;
					}
				}
				
				if(flag == false) {
					
				}else {
					pond[cur_x][cur_y] = 1;
					survival++;
				}
			}
			 System.out.println("#" + (tc+1) + " " + survival);
		}
		
		
	}	
}