package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 성수의프로그래밍강좌신청 {

	static int N;
	static int K;
	static float result;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("성수의프로그래밍강좌신청.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			result = 0;
			
			int arr [] = new int [N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for (int i = N-K; i < N; i++) {
				result = (result+arr[i]) / 2;
			}
			
			System.out.println("#" + t + " " + result);
		}
	}

}
