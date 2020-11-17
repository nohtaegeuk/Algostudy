package algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea건초더미 {

	static int N;
	static int avg;
	static int sum;
	static int result;
	static int [] arr = new int [10000];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("건초더미.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			avg = 0;
			sum = 0;
			result = 0;
			
			//초기화
			for (int i = 0; i < 10000; i++) {
				arr[i] = 0;
			}	
			
			//입력
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			avg = sum / N;
			
			
//			System.out.println(sum);
//			System.out.println(avg);
			for (int i = 0; i < N; i++) {
				
				result += Math.abs(avg - arr[i]);
				
			}
			
		//	System.out.println(result);
			
			System.out.println("#" + t + " " + result/2);
			
			
			
			
			
		}
	}

}
