package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea세가지합구하기 {

	static double S1,S2,S3;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("세가지합구하기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			double N = sc.nextDouble();
			
			S1 = 0;
			S2 = 0;
			S3 = 0;
			
			for (int i = 1; i <= N; i++) {
				
				S1 += i;
				
			}
			
			for (int i = 1; i <= 2*N; i++) {
			
				if(i % 2 == 1) {
					S2 += i;
				}
			}
			
			for (int i = 1; i <= 2*N; i++) {
				
				if(i %2 == 0) {
					S3 += i;
				}
				
			}
			
			System.out.println("#" + t + " " + Math.round(S1) + " " + Math.round(S2) + " " + Math.round(S3));
			
		}
	}

}
