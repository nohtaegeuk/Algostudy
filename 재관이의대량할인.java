package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class 재관이의대량할인 {

	static int [] arr = new int [100000];
	static int N;
	static int sum;
	static int sub;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("재관이의대량할인.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			//초기화
			N = sc.nextInt();
			sum = 0;
			sub = 0;
			count = 0;
			int result = 0;
			
			for (int i = 0; i < 100000; i++) {
				arr[i] = 0;
			}
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			count = N % 3;
			
			for (int i = N; i < 100000; i++) {
				sum += arr[i];
			}
			
			for (int i = N + count; i < 100000; i +=3) {
				sub += arr[i];
			}
			
			for (int i = N; i < N+count; i++) {
				result += arr[i];
			}
			
			result += sum - sub;
			
			System.out.println("#" + t + " " + result);
		}
	}

}
