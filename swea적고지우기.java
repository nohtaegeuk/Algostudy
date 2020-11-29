package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea적고지우기 {

	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("적고지우기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int count = 0;
			int arr [] = new int [10];
			
			for (int i = 0; i < 10; i++) {
				arr[i] = 0;
			}
			
			String str = sc.next();
			
			
			for (int i = 0; i < str.length(); i++) {
				
				int num = str.charAt(i) - '0';
				if(arr[num]==0) {
					arr[num] = 1;
				} else {
					arr[num] = 0;
				}
				
			}
			
			for (int i = 0; i < str.length(); i++) {
				if(arr[i] == 1) {
					count++;
				}
			}
			
			System.out.println("#" + t + " " + count);
			
			
		}
	}

}
