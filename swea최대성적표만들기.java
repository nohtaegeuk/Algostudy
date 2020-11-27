package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class swea최대성적표만들기 {

	static int N;
	static int K;
	static int arr [] = new int [100];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("최대성적표만들기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			int arr [] = new int [N];
			
			//초기화
			for (int i = 0; i < N; i++) {
				arr[i] = 0;
			}
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			int sum = 0;
			
			
			if(K == 1) {
				System.out.println("#" + t + " " + arr[N-1]);
			} else {
				for (int i = 0; i < K; i++) {
					sum += arr[N-1-i];
				}
				System.out.println("#" + t + " " + sum);
			}
			
			
		}
	}

}
