package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea늘어지는소리만들기 {

	
	static int H;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("늘어지는소리만들기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			char[] str1 = new char[str.length()];
			H = 0;
			
			for (int i = 0; i < str.length(); i++) {
				
				str1[i] = str.charAt(i);
				
			}
			
			H = sc.nextInt();
			
			int [] count = new int [str.length() + 1];
			
			int high = 0;
			for (int i = 0; i < H; i++) {
				
				high  =sc.nextInt();
				count[high]++;
				
			}
			
			String [] result = new String[str.length() + 1];
			
			for (int i = 0; i < count.length; i++) {
				String str2 = "";
				for (int j = 0; j < count[i]; j++) {
					str2 = str2 + "-";
				}
				result[i] = str2;
			}
			
			System.out.print("#" + t + " ");
			
			for (int i = 0; i < str.length(); i++) {
				
				System.out.print(result[i]);
				System.out.print(str1[i]);
			}
			
			System.out.println(result[str.length()]);
			
		}
	}

}
