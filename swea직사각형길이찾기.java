package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea직사각형길이찾기 {

	static int a;
	static int b;
	static int c;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("직사각형길이찾기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			
			a = 0; b = 0; c = 0;
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a==b && b==c && a==c) {
				System.out.println("#" + t + " " + c);
			} else if(a==b && a!=c) {
				System.out.println("#" + t + " " + c);
			} else if(a==c && a!=b) {
				System.out.println("#" + t + " " + b);
			} else if(b==c && b!=a) {
				System.out.println("#" + t + " " + a);
			}
		}
	}

}
