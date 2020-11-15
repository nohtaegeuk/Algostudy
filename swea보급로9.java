package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea보급로9 {

	// map과 방문했는지 검사하는 visit배열
	static int map [][];
	static int visit [][];
	static int N;
	static int minValue;
	// 상하좌우 검사하는 배열
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("보급로.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			
			map = new int [N][N];
			visit = new int [N][N];
			int result = 0;
			
			// 초기화
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}
			
			
			// 초기화
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					visit[i][j] = 1;
				}
			}
			
			
			
			//map[0][0] = visit[0][0];
			result = map[0][0];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					
					Search(i,j,result);
				}
			}
			
			System.out.println("#" + t + " " + minValue);
			
		}
	}

	private static void Search(int x, int y, int result) {
		// TODO Auto-generated method stub
		if( visit[x][y] != 1) {
			return;
		}
		
		visit[x][y] = -1;
		
		for (int i = 0; i < 4; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= N || ny >= N || nx<0 || ny <0) {
				return;
			} else if(x == N-1 && y == N-1){
				if(minValue > result) {
					minValue = result;
				}
			} else  {
				result = result + map[nx][ny];
				if(result >= minValue) {
					return;
				} else {
					Search(nx, ny, result);
				}
				
			}
			
		}
		
		
		
	}

}
