package 백준알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon별찍기10 {

	static int n;
	static char[][] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		recur(0,0,n);
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void recur(int i, int j, int n2) {
		// TODO Auto-generated method stub
		int point = 0;
		
		if(n2 == 1) {
			arr[i][j] = '*';
			return;
		}
		
		point = n2 / 3;
		
		for (int k = 0; k < 3; k++) {
			for (int k2 = 0; k2 < 3; k2++) {
				if(k == 1 && k2 == 1) {
					continue;
				} else {
					recur(i + (point * k), j + (point * k2), point);
				}
			}
		}
		
	}

}
