package algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea보급로12 {

	static int N;
	static int [][] map = new int [100][100];
	static int [][] visit = new int [100][100];
	static int minValue;
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("보급로.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = 0;
			N = sc.nextInt();
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = 0;
					visit[i][j] = 10000;
				}
			}
			
			minValue = 10000;
			
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}
			
			Search(0,0,0);
			
			System.out.println("#" + t + " " + minValue);
			
		}
	}

	private static void Search(int i, int j, int result) {
		// TODO Auto-generated method stub
		
		if(i > N-1 || j > N-1 || i < 0 || j < 0) {
			return;
		}
		
		if(i == N-1 && j == N-1) {
			if(minValue > result) {
				minValue = result;
				return;
			}
		}
		
		if(visit[i][j] <= result + map[i][j]) {
			return;
		}
		
		result += map[i][j];
		visit[i][j] = result;
		
		if(result  >= minValue) {
			return;
		} else {
			for (int k = 0; k < 4; k++) {
				int nx = i + dx[k];
				int ny = j + dy[k];
				Search(nx,ny,result);
			}
		}
		
	}

}
