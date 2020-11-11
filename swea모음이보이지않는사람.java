package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea모음이보이지않는사람 {

	static char [] arr = new char [50];
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("모음이보이지않는사람.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			
			
			for (int i = 0; i < 50; i++) {
				arr[i] = 'a';
			}
			
			for (int i = 0; i < str.length(); i++) {
				
				arr[i] = str.charAt(i);
			}
			
			System.out.print("#" + t + " ");
			
			for (int i = 0; i < 50; i++) {
				
				if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u') {
					
				} else {
					System.out.print(arr[i]);
				}
				
			}
			
			System.out.println();
			
			
			
			
		}
	}

}
