package 알고리즘공부;

import java.util.Scanner;

public class 피보나치재귀5 {

	static int[] arr = new int[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println(fibo(t));
	}
	private static int fibo(int N) {
		// TODO Auto-generated method stub
		if(N==1) {
			return 0;
		} else if(N==2) {
			return 1;
		} else {
			if(arr[N] != 0) {
				return arr[N];
			} else {
				arr[N] = fibo(N-1) + fibo(N-2);
				return arr[N];
			}
		}
	}
	
	

}
