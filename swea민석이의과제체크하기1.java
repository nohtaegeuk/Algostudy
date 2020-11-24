package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea민석이의과제체크하기1 {

	static int [] arr = new int[102];
	static int N;
	static int K;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("민석이의과제체크하기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			//초기화
			for (int i = 1; i <= 101; i++) {
				arr[i] = 2;
			}
			
			N = sc.nextInt();
			K = sc.nextInt();
			
			for (int i = 1; i <= K; i++) {
				int a = sc.nextInt();
				arr[a] = 1;
			}
			
			for (int i = 1; i <= N; i++) {
				if(arr[i] != 1) {
					arr[i] = 0;
				}
			}
			
			System.out.print("#" + t + " ");
			
			for (int i = 1; i <= N; i++) {
				
				if(arr[i] == 0) {
					System.out.print(i + " ");
				}
				
			}
			
			System.out.println();
			
		}
	}

}
