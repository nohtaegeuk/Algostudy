package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea거듭제곱 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("거듭제곱.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			int test_case = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int result = N;
			
			for (int i = 1; i < M; i++) {
				
				result = result * N;
				
			}
			
			System.out.println("#" + t + " " + result);
			
		}
	}

}
