package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea보충학습과평균 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("보충학습과평균.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] arr = new int [5];
		
		for (int t = 1; t <= T; t++) {
			
			for (int i = 0; i < 5; i++) {
				
				arr[i] = sc.nextInt();
				
			}
			
			
			for (int i = 0; i < 5; i++) {
				
				if(arr[i] < 40) {
					arr[i] = 40;
				}
			}
			
			
			int sum = 0;
			
			for (int i = 0; i < 5; i++) {
				sum += arr[i];
			}
			
			int result = 0;
			result = sum / 5;
			
			System.out.println("#" + t + " " + result);
		
			
			
		}
		
		
		
	}

}
