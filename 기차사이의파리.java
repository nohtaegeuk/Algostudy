package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 기차사이의파리 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("기차사이의파리.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			double d = sc.nextInt();
			double a = sc.nextInt();
			double b = sc.nextInt();
			double f = sc.nextInt();
			
			double time = d / (b+f);
			double dis = f * time - a * time;
			double time2 = dis / (a+b);
			
			double result = f*time + f * time2;
			
			System.out.println("#"+ t + " " + result);
			
		}
	}

}
