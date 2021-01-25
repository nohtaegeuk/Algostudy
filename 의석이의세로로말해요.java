package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 의석이의세로로말해요 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("의석이의세로로말해요.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String [] arr = new String[5];
			
			for (int i = 0; i < 5; i++) {
				arr[i] = sc.next();
			}
			
			int max = 0;
			
			for (int i = 0; i < 5; i++) {
				max = Math.max(max, arr[i].length());
			}
			
			System.out.print("#" + t + " ");
			
			for (int i = 0; i < max; i++) {
				for (int j = 0; j < 5; j++) {
					if(arr[j].length() <= i) {
						continue;
					}
					System.out.print(arr[j].charAt(i));
				}
			}
			
			System.out.println();
		}
	}

}
