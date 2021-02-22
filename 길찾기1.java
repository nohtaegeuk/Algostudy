package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 길찾기1 {

	static int n;
	static int [][] arr = new int [100][100];
	static int result;
	static int [] visit = new int [100];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("길찾기.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			//입력
			int testcase = sc.nextInt();
			n = sc.nextInt();
			result = 0;
			
			//초기화
			for (int i = 0; i < 100; i++) {
				visit[i] = 0;
				for (int j = 0; j < 100; j++) {
					arr[i][j] = 0;
				}
			}
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				arr[a][b] = 1; // 있음
			}
			
			dfs(0);
			
			System.out.println("#" + t + " " + result);
			
		}
	}

	private static void dfs(int i) {
		// TODO Auto-generated method stub
		
		if(i == 99) {
			result = 1;
			return;
		} else {
	
			visit[i] = 1;
			
			for (int j = 0; j < 100; j++) {
				
				if(visit[j] == 0 && arr[i][j] == 1) {
					dfs(j);
				}
			}
			
			visit[i] = 0;
		}
		
		
	}

}
