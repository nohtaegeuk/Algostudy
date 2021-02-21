package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 미로11 {

	static int [][] map = new int [16][16];
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	static int [][] check = new int [16][16];
	static int result;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("미로1.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		for (int t = 1; t <= 10; t++) {
			
			int testcase = sc.nextInt();
			
			//초기화
			for (int i = 0; i < 16; i++) {
				for (int j = 0; j < 16; j++) {
					map[i][j] = 0;
					check[i][j] = -1;
				}
			}
			
			result = 0;
			
			for (int i = 0; i < 16; i++) {
				
				String str = sc.next();
				
				for (int j = 0; j < 16; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}
			
			for (int i = 0; i < 16; i++) {
				for (int j = 0; j < 16; j++) {
					
					if(map[i][j] == 2) {
						find(i,j);
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
			
		}
	}

	private static void find(int i, int j) {
		// TODO Auto-generated method stub
		
		for (int j2 = 0; j2 < 4; j2++) {
			
			int cur_x = i + dx[j2];
			int cur_y = j + dy[j2];
			
			if(cur_x >=0 && cur_y >=0 && cur_x<16 && cur_y<16) {
				if(map[cur_x][cur_y] == 0) {
					if(check[cur_x][cur_y] != 1) {
						check[cur_x][cur_y] = 1;
						find(cur_x,cur_y);
					}						
				} else if(map[cur_x][cur_y] == 3) {
					result = 1;
					break;
				}
			}
			
		}
	}

	
}


