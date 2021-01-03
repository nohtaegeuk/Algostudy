package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class 제곱팰린드롬수 {

	
	static int A;
	static int B;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("제곱팰린드롬수.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			//초기화
			A = sc.nextInt();
			B = sc.nextInt();
			count = 0;
			
			for (int i = A; i <= B; i++) {
				
				if(i==1||i==4||i==9||i==121||i==484) {
					count++;
				}
			}
			
			System.out.println("#" + t + " " + count);
		}
		
	}

}
