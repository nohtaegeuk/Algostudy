package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class 높은선반 {

	static int N; // 점원 수
	static int B; // B이상인 탑중에서 가장 낮은 탑
	static int [] h;
	static int result;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("장훈이의높은선반.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			//입력
			N = sc.nextInt();
			B = sc.nextInt();
			h = new int[N];
			
			for (int i = 0; i < N; i++) {
				h[i] = sc.nextInt();
			}
			
			result = Integer.MAX_VALUE;
			
			Arrays.sort(h); // 정렬
			
			dfs(-1, 0); //첫번째 배열부터 더해나감
			
			System.out.println("#" + t + " " + (result - B));
		}
	}

	private static void dfs(int i, int height) {
		// TODO Auto-generated method stub
		
		if( height > result ) {
			return;
		} else if( height >= B ) {
			result = Math.min(result, height);
			return;
		}
		
		for (int j = i+1; j < N; j++) {
			dfs(j, height + h[j]);
		}

	}

}
