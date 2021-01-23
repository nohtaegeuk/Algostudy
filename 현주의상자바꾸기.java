package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class 현주의상자바꾸기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("현주의상자바꾸기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int n = sc.nextInt();
			int q = sc.nextInt();
			
			int arr [] = new int [n];
			
			for (int i = 1; i <= q; i++) {
				
				int l = sc.nextInt();
				int r = sc.nextInt();
				
				for (int j = l; j <= r; j++) {
					arr[j-1] = i;
				}
			}
			
			System.out.print("#" + t + " ");
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
			System.out.println();
		}
	}

}
