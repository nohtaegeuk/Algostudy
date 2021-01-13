package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class 극장좌석 {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("극장좌석.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int arr [] = new int [N];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int result = N;
			
			for (int i = 0; i < arr.length; i++) {
				result += arr[i];
			}
			
			result += arr[arr.length-1];
			
			System.out.println("#" + t + " " + result);
		}
	}

}
