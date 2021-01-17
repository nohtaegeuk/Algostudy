package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 한빈이와spotmart {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("한빈이와spotmart.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int arr [] = new int [N+1];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int result = -1;
			
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					if(arr[i] + arr[j] <= M) {
						result = Math.max(result, arr[i] + arr[j]);
					}
				}
			}
			
			
			System.out.println("#" + t + " " + result);
			
		}
	}

}
