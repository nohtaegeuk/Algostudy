package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 길찾기 {

	
	static int[][] a;
	static int[] v;
	static int find;
	
	public static void dfs(int x) {
		if(find == 1)
			return;
		if(x == 99) {
			find = 1;
			return;
		}
		v[x] = 1;
		for(int i = 0; i < 100; i++) {
			if(v[i] == 0 && a[x][i] == 1)
				dfs(i);
		}
		v[x] = 0;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("길찾기.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		for (int t = 1; t <= 10; t++) {
			
			int tc = sc.nextInt();
			int n = sc.nextInt();
			
			a = new int[100][100];
			v = new int[100];
			find = 0;
			
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				a[x][y] = 1;
			}
			
			dfs(0);
			
			System.out.println("#" + t + " " + find);
		}
	}

}
