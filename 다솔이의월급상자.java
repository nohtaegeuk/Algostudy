package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 다솔이의월급상자 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("다솔이의월급상자.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			
			double arr1 [] = new double [N];
			double arr2 [] = new double [N];
			
			for (int i = 0; i < N; i++) {
				arr1[i] = sc.nextDouble();
				arr2[i] = sc.nextDouble();
			}
			
			double result = 0;
			
			for (int i = 0; i < N; i++) {
				result += arr1[i] * arr2[i];
			}
			
			System.out.println("#" + t + " " + result);
		}
	}

}
