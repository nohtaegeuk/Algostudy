package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea회문1 {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("회문1.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			int N = sc.nextInt(); // 찾을려고 하는 회문길이
			int[][] map = new int [8][8];
			
			int result = 0;
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					map[i][j] = 0;
				}
			}
			
			
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8-N+1; j++) {
					int tmp = 0;
					for (int k = 0; k < N/2; k++) {
						if(map[i][j+k] != map[i][j+N-k-1]) {
							tmp = 1;
						}
					}
					if(tmp == 0) {
						result++;
					}
				}
			}

			for (int i = 0; i < 8-N+1; i++) {
				for (int j = 0; j < 8; j++) {
					int tmp = 0;
					for (int k = 0; k < N/2; k++) {
						if(map[i+k][j] != map[i+N-k-1][j]) {
							tmp = 1;
						}
					}
					if(tmp == 0) {
						result++;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
			
		}
			
			
			
		}
	}


