package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 준홍이의카드놀이 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("준홍이.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr_N = new int[N+1];
			int[] arr_M = new int[M+1];
			int[] count = new int[N+M+1];
			
			for (int i = 1; i <= N; i++) {
				arr_N[i] = i;
			}
			for (int i = 1; i <= M; i++) {
				arr_M[i] = i;
			}
			
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					count[arr_N[i] + arr_M[j]]++;
				}
			}
			
			int max = count[2];
			
			for (int i = 3; i <= N+M; i++) {
				if(max <= count[i]) {
					max = count[i];
				}
			}
			
			
			System.out.print("#" + t + " ");
			
			for (int i = 2; i <= N+M; i++) {
				if(count[i] == max) {
					System.out.print(i + " ");
				}
			}
			
			
			System.out.println();
			
			
			
			
		}
	}

}
