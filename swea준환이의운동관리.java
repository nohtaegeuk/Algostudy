package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea준환이의운동관리 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("준환이의운동관리.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			int result = L-X;
			
			if(X > L && X > U) {
				System.out.println("#" + t + " " + "-1");
			} else if( X >= L && X <=U) {
				System.out.println("#" + t + " " + "0");
			} else {
				System.out.println("#" + t + " " + result);
			}
		}
		
	}

}
