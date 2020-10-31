package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sweaString {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("String.txt"));
		Scanner sc = new Scanner(System.in);
		for(int t = 1; t <= 10; t++) {
			int tmp = sc.nextInt();
			int cnt = 0;
			String s = sc.next();
			String b = sc.next();
			
			for(int i = 0; i <= b.length() - s.length(); i++) {
				String c = b.substring(i, i + s.length());
				if(c.equals(s))
					cnt++;
			}
			System.out.println("#" + t + " " + cnt);
		}
	}
}