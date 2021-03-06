package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea농작물수확하기2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("농작물수확하기.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				
				for (int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = Math.abs(N/2-i); j < N-Math.abs(N/2-i); j++) {
					sum += arr[i][j];
				}
			}
			
			System.out.println("#" + t + " " + sum);
			
		}
	}

}
