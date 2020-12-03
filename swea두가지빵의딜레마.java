package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea두가지빵의딜레마 {

	static int A;
	static int B;
	static int C;
	static int sum;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("두가지빵의딜레마.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			//빵 가격, 내돈
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			
			// 빵 중 적은 가격
			int D = Math.min(A, B);
			int F = Math.max(A, B);
			//System.out.println(D);
			
			sum = 0;
			
			// 적은 가격 빵으로 최대한 사서 sum에 저장
			sum = C / D;
			
			System.out.println(sum);
			// 남은 돈
			int E = C - (D*sum);
			
			if(E != 0) {
				sum += E / F;
			}
			
			
			System.out.println("#" + t + " " + sum);
			
			
		}
	}

}
