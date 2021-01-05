package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class 두문자어 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("두문자어.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String[] str1 = new String[3];
			for(int i = 0; i < 3; i++) {
				String str = sc.next();
				str1[i] = str.substring(0,1).toUpperCase();
		
			}
			System.out.print("#" + t + " ");
			
			for(int i = 0; i < 3; i++) {
				System.out.print(str1[i]);
			}
			
			System.out.println();
			
			
		}
	}

}
