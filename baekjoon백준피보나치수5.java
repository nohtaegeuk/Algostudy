package 백준알고리즘;

import java.util.Scanner;


public class 백준피보나치수5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		sum = fibo(n);
		
		System.out.println(sum);
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
			
		} else if(n == 1) {
			
			return 1;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}

}
