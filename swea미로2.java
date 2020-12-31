package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea미로2 {

	static int map [][] = new int [100][100];
	static int check [][] = new int [100][100];
	
	static int dx [] = {0,0,1,-1};
	static int dy [] = {1,-1,0,0};
	static int result = 0;
	
	public static void dfs(int x, int y) {	
		
			for (int i = 0; i < 4; i++) {
				
				int xx = x + dx[i];
				int yy = y + dy[i];
					
				if(xx >= 0 && yy >= 0 && xx < 100 && yy < 100) {
					if(map[xx][yy] == 0) {
						if(check[xx][yy] != 1) {
							check[xx][yy] = 1;
							dfs(xx,yy);
						}						
					} else if(map[xx][yy] == 3) {
						result = 1;
						break;
					} else if(map[xx][yy] == 1) {
					}
				} 
			}
		
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("미로2.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		for (int t = 1; t <= 10; t++) {
			
			int testcase = sc.nextInt();
			
			//초기화
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = -1;
					check[i][j] = -1;
				}
			}
			result = 0;
			//minCount = 20000;
			//int count = 0;
			
			//입력
			for (int i = 0; i < 100; i++) {
				
				String str = sc.next();
				
				for (int j = 0; j < 100; j++) {
					
					map[i][j] = str.charAt(j) - '0';
				}
			}
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if(map[i][j] == 2) {
						check[i][j] = 1;
						dfs(i,j);
					}	
				}
			}	
			System.out.println("#" + t + " " + result);
		}
	}

}
