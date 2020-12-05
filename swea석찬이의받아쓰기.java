package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea석찬이의받아쓰기 {

	static int N;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("석찬이의받아쓰기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			count = 0;
			
			
			String str1 = sc.next();
			String str2 = sc.next();
			
			
			for (int i = 0; i < str1.length(); i++) {
				
				if(str1.charAt(i) == str2.charAt(i)) {
					count++;
				}	
			}
			
			
			System.out.println("#" + t + " " + count);
			
			
			
		}
		
	}

}
