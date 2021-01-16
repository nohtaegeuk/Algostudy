package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class 외로운문자 {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("외로운문자.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			String answer = "";
			int [] result = new int [27];
			//초기화
			for (int i = 0; i < str.length(); i++) {
				
				int a = str.charAt(i) - 'a';
				result[a]++;
			}
			
			for (int i = 0; i < 27; i++) {
				if(result[i] % 2 != 0) {
					answer += (char)(i + 97);
				}
			}
			
			if(answer.equals("")) {
				answer = "Good";
			}
			
			System.out.println("#" + t + " " + answer);
			
			
		}
	}

}
