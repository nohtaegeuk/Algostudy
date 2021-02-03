package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 장훈이의높은선반 {

	static int N;
	static int B;
	static int min;
	static int arr[];
	
	public static void dfs(int idx, int sum) {
		// TODO Auto-generated method stub
		if(sum >= B) {
			min = Math.min(sum, min);
			return;
		}
		if(idx == N) {
			if(sum >= B) {
				min = Math.min(sum, min);
			} else {
				return;
			}
		}
		
		dfs(idx+1, sum+arr[idx]);
		dfs(idx+1, sum);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("장훈이의높은선반.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			B = sc.nextInt();
			arr = new int [N];
			
			min = 0;
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				min += arr[i];
			}
			
			min++;
			dfs(0,0);
			System.out.println("#" + t + " " + (min-B));
			
			
			
		}
	}

	

}
