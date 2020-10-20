package 알고리즘공부;

import java.util.Scanner;

public class 피보나치재귀 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ans = fibo(n);
		
		System.out.println(ans);
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		
		return fibo(n-1) + fibo(n-2);
	}

}
