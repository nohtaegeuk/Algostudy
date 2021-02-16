package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 사칙유효성검사 {

	static int result;
	static int size;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("사칙유효성검사.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			result = 0;
			size = sc.nextInt();
			sc.next();
			
			for (int i = 0; i < size; i++) {
				
				String[] str = sc.nextLine().split(" ");
				
				if(i < size / 2 ) {
					if(str[1].equals("+") || str[1].equals("-") || str[1].equals("*") || str[1].equals("/")) {
						result = 1;
					} else {
						result = 0;
					}
				} else {
					if(str[1].equals("+") || str[1].equals("-") || str[1].equals("*") || str[1].equals("/")) {
						result = 0;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}

}
