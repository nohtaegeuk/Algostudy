package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 올림픽종목투표 {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("올림픽종목투표.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			int[] v = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(a[j] <= b[i]) {
						v[j]++;
						break;
					}
				}
			}
			int idx = 0;
			int max = 0;
			for(int i = 0; i < n; i++) {
				if(v[i] > max) {
					idx = i;
					max = v[i];
				}
			}
			System.out.println("#" + t + " " + (idx + 1));
			
		}
	}	

}
