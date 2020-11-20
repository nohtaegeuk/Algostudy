package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea홀수일까짝수일까 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("홀수일까짝수일까.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			
			if(str.charAt(str.length()-1) % 2 == 1) {
				System.out.println("#" + t + " " + "Odd");
			} else {
				System.out.println("#" + t + " " + "Even");
			}
			
			
		}
	}

}
