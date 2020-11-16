package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea장애물경주난이도 {

	static int block [] = new int [101];
	static int plus [] = new int [1001];
	static int minus [] = new int [1001];
	static int plus_max;
	static int minus_max;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("장애물경주난이도.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			plus_max = 0; 
			minus_max = 0;
			// 초기화
			for (int i = 0; i < 101; i++) {
				block[i] = 0;
			}
			
			for (int i = 0; i < 1001; i++) {
				plus[i] = 0;
				minus[i] = 0;
			}
			
			//입력
			for (int i = 0; i < N; i++) {
				block[i] = sc.nextInt();
			}
			
			for (int i = 0; i < N-1; i++) {
				
				if(block[i+1] - block[i] < 0) {
					minus[i] = Math.abs(block[i+1] - block[i]);
				} else {
					plus[i] = block[i+1] - block[i];
				}
			}
			
//			for (int i = 0; i < 10; i++) {
//				System.out.println(minus[i]);
//			}
			
			
			for (int i = 0; i < 1001; i++) {
				if(plus_max < plus[i]) {
					plus_max = plus[i];
				}
			}
			
			
			for (int i = 0; i < 1001; i++) {
				if(minus_max < minus[i]) {
					minus_max = minus[i];
				}
			}
			
			System.out.println("#" + t + " " + plus_max + " " + minus_max);
			
			
			
		}
	}

}
