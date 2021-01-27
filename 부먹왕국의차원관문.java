package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 부먹왕국의차원관문 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("부먹왕국의차원관문.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int cnt = 0;
			int idx = 0;
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if(a[i] == 1)
					idx = i;
			}
			
			int go = m - 1;
			for(int i = idx; i >= 0; i--) {
				if(a[i] == 1) {
					go = m - 1;
				}
				else if(go == 0) {
					a[i] = 1;
					cnt++;
					go = m -1;
				}
				else {
					go--;
				}
			}
			
			for(int i = idx; i < n; i++) {
				if(a[i] == 1) {
					go = m - 1;
				}
				else if(go == 0) {
					a[i] = 1;
					cnt++;
					go = m - 1;
				}
				else {
					go--;
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
	}

}
