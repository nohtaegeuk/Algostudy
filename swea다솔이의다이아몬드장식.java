package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea다솔이의다이아몬드장식 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("다솔이의다이아몬드장식.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			
			String str1 = "";
			String str2 = "";
			String str3 = "";
			
			for (int i = 0; i < str.length(); i++) {
				
				str1 += "..#.";
				str2 += ".#.#";
				str3 += "#." + str.charAt(i) + ".";
				
			}
			
			str1 += ".";
			str2 += ".";
			str3 += "#";
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			System.out.println(str2);
			System.out.println(str1);
			
		}
	}

}
