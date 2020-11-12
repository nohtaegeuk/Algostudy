package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea다양성측정 {

	static int [] arr = new int [10];
	static int result;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("다양성측정.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			result = 0;
			
			//초기화
			for (int i = 0; i < 10; i++) {
				arr[i] = 0;
			}
			
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - '0']++;
				
				
			}
			
			for (int i = 0; i < 10; i++) {
				if(arr[i] != 0) {
					result++;
				}
			}
			System.out.println("#" + t + " " + result);
		}
		
	}

}
