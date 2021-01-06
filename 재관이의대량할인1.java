package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class 재관이의대량할인 {

	static int sum;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("재관이의대량할인.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			sum = 0;
			int N = sc.nextInt();
			int arr [] = new int [N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				sum += arr[i];
			}
			//System.out.println(sum);
			Arrays.sort(arr);
			
			int sub = 0;
			for (int i = N-3; i >= 0; i-=3) {
				sub += arr[i];
			}
			//System.out.println(sub);
			int result = 0;
			result = sum - sub;
			
			System.out.println("#" + t + " " + result);
		}
	}

}
