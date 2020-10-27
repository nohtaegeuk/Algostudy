package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import 알고리즘공부.swea보급로2.Pos;

public class swea보급로6 {

	
	public static class Pos{
		int x;
		int y;
		
		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("보급로.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int [][] map = new int[N][N];
			int [][] visit = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0';
					visit[i][j] = Integer.MAX_VALUE;
				}
			}
			
			
			Queue <Pos> q = new LinkedList<>();
			q.add(new Pos(0,0));
			visit[0][0] = map[0][0];
			
			while(!q.isEmpty()) {
				Pos cur = q.poll();
				for (int i = 0; i < 4; i++) {
					int nx = cur.x + dx[i];
					int ny = cur.y + dy[i];
				
					if(nx>=N || ny>=N || nx<0 || ny<0) {
						continue;
					}
					
					if(visit[nx][ny] > visit[cur.x][cur.y] + map[nx][ny]) {
						visit[nx][ny] = visit[cur.x][cur.y] + map[nx][ny];
						q.add(new Pos(nx,ny));
					}
				
				}
				
				
				
				
				
			}
			
			System.out.println("#" + t + " " + visit[N-1][N-1]);
			
			
			
		}
	}

}
