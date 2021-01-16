package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 과자분배 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("과자분배.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			if(N % K == 0) {
				System.out.println("#" + t + " " + "0");
			} else {
				System.out.println("#" + t + " " + "1");
			}
		}
	}

}
