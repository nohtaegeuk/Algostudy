package 알고리즘공부;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[100];
			arr[0] = 0;
			arr[1] = 1;
			
			for (int j = 2; j < 50; j++) {
				arr[j] = arr[j-1] + arr[j-2];
			}
			
			System.out.println(arr[n]);
			
			
		}
		
		
	}

}
