package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea쥬스나누기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("쥬스나누기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			
			System.out.print("#" + t + " ");
			for (int i = 1; i <= N; i++) {
				System.out.print( 1 + "/" + N + " ");
			}
			
			System.out.println();
			
		}
		
	}

}
