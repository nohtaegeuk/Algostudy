package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 파도반수열 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("파도반수열.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int n = sc.nextInt();
			long[] a = new long[101];
			
			a[1] = 1; a[2] = 1; a[3] = 1; a[4] = 2; a[5] = 2;
			
			for(int i = 6; i <= n; i++) {
				a[i] = a[i-1] + a[i-5];
			}
			
			System.out.println("#" + t + " " + a[n]);
		}
	}

}
