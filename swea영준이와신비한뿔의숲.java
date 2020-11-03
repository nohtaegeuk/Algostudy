package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea영준이와신비한뿔의숲 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("뿔의숲.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int result2 = n-m;
			int result1 = m - result2;
			
			System.out.println("#" + t + " " + result1 + " " + result2);
			
			
		}
		
	}

}
