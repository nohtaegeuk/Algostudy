package 알고리즘공부;

import java.util.Scanner;

public class 피보나치재귀3 {

	static int[] arr = new int[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = fibo(N);
		
		System.out.println(result);
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 0;
		} else if(n==2) {
			return 1;
		} else {
			if(arr[n] != 0) {
				return arr[n];
			} else {
				arr[n] = fibo(n-1) + fibo(n-2);
				return arr[n];
			}
		}
	}

}
