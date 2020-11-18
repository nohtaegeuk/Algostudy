package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea소득불균형 {

	static int N;
	static int sum;
	static int avg;
	static int count;
	static int arr [] = new int [10000];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("소득불균형.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			sum = 0;
			avg = 0;
			count = 0;
			
			//초기화
			for (int i = 0; i < 10000; i++) {
				arr[i] = 0;
			}
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			avg = sum / N;
			
			for (int i = 0; i < N; i++) {
				
				if(arr[i] <= avg) {
					count++;
				}
			}
			
			System.out.println("#" + t + " " + count);
			
			
		}
	}

}
