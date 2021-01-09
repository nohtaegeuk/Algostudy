package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class 보물왕태혁 {

	static int P;
	static int min;
	static int max;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("보물왕태혁.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			P = sc.nextInt();
			min = 0;
			max = 0;
			int arr [] = new int [P];
			
			for (int i = 0; i < P; i++) {
				arr[i] = sc.nextInt();
			}
			
			min = arr[0];
			max = arr[0];
			
			for (int i = 1; i < P; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			for (int i = 1; i < P; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			
			if(P == 1) {
				System.out.println("#" + t + " " + arr[0]*arr[0]);	
			} else {
				System.out.println("#" + t + " " + max*min);
			}
		}
	}

}
