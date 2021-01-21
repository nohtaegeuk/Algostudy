package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 문제제목붙이기 {

	static int N;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("문제제목붙이기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			String str;
			int [] arr = new int [30];
			
			
			for (int i = 0; i < N; i++) {
				str = sc.next();
				
				arr[str.charAt(0) - 65]++;
			}
			
			int count = 0;
			
			for (int i = 0; i < 30; i++) {
				if(arr[i] != 0) {
					count++;
				} else if(arr[i] == 0) {
					break;
				}
			}
			
			System.out.println("#" + t + " " + count);
		}
	}

}
