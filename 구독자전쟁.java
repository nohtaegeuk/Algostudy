package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 구독자전쟁 {

	static int N,A,B;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("구독자전쟁.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			
			int min = 0;
			int max = 0;
			
			if(A == B && B==N) {
				max = A;
				min = B;
			} else if(A+B <= N) {
				max = Math.min(A, B);
				min = 0;
			} else if(A+B > N) {
				max = Math.min(A, B);
				min = A+B-N;
			}
			
			System.out.println("#" + t + " " + max + " " + min);
		}
	}


}
