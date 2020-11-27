package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea태혁이의사랑은타이밍 {

	static int D;
	static int H;
	static int M;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("태혁이의사랑은타이밍.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			D = sc.nextInt();
			H = sc.nextInt();
			M = sc.nextInt();
			
			int result1 = 11*60*24 + 11*60 + 11;
			int result2 = D*60*24 + H*60 + M;
			int result = result2 - result1;
			
			if(D == 11 && H == 11 && M==11 ) {
				System.out.println("#" + t + " " + "0");
			} else if(D == 11 && (H<11 || M<11)) {
				System.out.println("#" + t + " " + "-1");
			} else {
				System.out.println("#" + t + " " + result);
			}
			
			
		}
	}	

}
