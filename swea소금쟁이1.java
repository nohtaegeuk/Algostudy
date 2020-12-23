package ����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class �ұ����� {

	static int dr[] = {0,-1,1,0,0};
	static int dc[] = {0,0,0,-1,1};
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("�ұ������հ�_tc.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt(); // �ұ����� ��
			
			int[][] map = new int[N][N]; // �ʸ����
			int[] cur_x = new int[M]; // ������ġ
			int[] cur_y = new int[M]; // ������ġ
			int[] direction = new int[M];
		
			
			
			for (int i = 0; i < M; i++) {
				cur_x[i] = sc.nextInt();
				cur_y[i] = sc.nextInt();
				direction[i] = sc.nextInt();
			}
			
			int[] cansu = {3,2,1};

		
			for (int i = 0; i < M; i++) {
				 
				 int x = cur_x[i];
				 int y = cur_y[i];
				 
				 for (int j = 0; j < 3; j++) {
					x += dr[direction[i]] * cansu[j];
					y += dc[direction[i]] * cansu[j];
					
					if(x <0 || x>=N || y<0 || y>=N) {
						M--;
						break;
					} else if(x>=0 && x<N && y>=0 && y<N) {
						if(map[x][y] == 1) {
							M--;
							break;
						}
					}
					map[x][y] = 1;
					
				 }
				 
				
				 
			}
			

			
			System.out.println("#" + tc + " " + M);
		}
	}

}
