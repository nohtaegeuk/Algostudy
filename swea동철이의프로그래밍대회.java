package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea동철이의프로그래밍대회 {

	static int [][] arr = new int [20][20];
	static int [] count = new int [20];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("동철이의프로그래밍대회.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			//초기화
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					
					arr[i][j] = 2;
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < 20; i++) {
				count[i] = 0;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					
					if(arr[i][j] == 1) {
						count[i]++;
					}
				}
			}
			
			int count2 = 0;
			
			int max = count[0];
			
			for (int i = 1; i < N; i++) {
				
				if(max < count[i]) {
					max = count[i];
				}
			}
			
			for (int i = 0; i < N; i++) {
				if(count[i] == max) {
					count2++;
				}
			}
			
			System.out.println("#" + t + " " + count2 + " " + max);
			
			
		}
		
	}

}
