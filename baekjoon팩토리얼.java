package 백준알고리즘;

import java.util.Scanner;

public class 팩토리얼 {

	static int N;
	static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			N = sc.nextInt();
			
			sum = factorial(N);
			
			System.out.println(sum);
		
	}

	private static int factorial(int n2) {
		// TODO Auto-generated method stub
		if(n2 <= 1) {
			return 1;
		} else {
			return n2 * factorial(n2-1);
		}
	}

}
