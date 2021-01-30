package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 정삼각형분할놀이 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("정삼각형분할놀이.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long result = (a*a) / (b*b);
			System.out.println("#" + t + " " + result);
		}
	}

}
