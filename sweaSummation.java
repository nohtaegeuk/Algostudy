package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sweaSummation {

	
	static int [] arr = new int [10];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Summation.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			//초기화
			for (int i = 0; i < 10; i++) {
				
				arr[i] = 0;
			}
			
			
			for (int i = 0; i < 10; i++) {
				
				String str = sc.next();
				
				for (int j = 0; j < str.length(); j++) {
					
					arr[i] += str.charAt(j) - '0'; 
				}
				
			}
			
			Arrays.sort(arr);
			
			System.out.println("#" + t + " " + arr[9] + " " + arr[0]);
			
		}
	}

}
