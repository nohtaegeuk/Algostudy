package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea원재의메모리복구 {

	static int count;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("원재의메모리복구.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			
			count = 0;
			
			int arr [] = new int [str.length()];
			
			for (int i = 0; i < str.length(); i++) {
				
				arr[i] = str.charAt(i) - '0';
			}
			
			
			if( arr[0] == 1) {
				count++;
			}
			for (int i = 1; i < arr.length; i++) {
				
				if(arr[i] != arr[i-1] ) {
					count++;
				}
			}
			
			System.out.println("#" + t + " " + count );
		}
	}

}
