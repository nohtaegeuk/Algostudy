package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 퍼펙트셔플1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("퍼펙트셔플.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int a,b = 0;
			
			if(N % 2 == 1) {
				a = N/2 + 1;
				b = N/2;
			} else {
				a = N/2;
				b = N/2;
			}
			
			String [] arr1 = new String[a];
			String [] arr2 = new String[b];
			
			for (int i = 0; i < a; i++) {
				arr1[i] = sc.next();
			}
			
			for (int i = 0; i < b; i++) {
				arr2[i] = sc.next();
			}
			
			String [] result = new String[N];
			
			for (int i = 0; i < N; i++) {
				
				if(i % 2 == 0) {
					result[i] = arr1[i / 2];
				} else {
					result[i] = arr2[i / 2];
				}
			}
			
			System.out.print("#" + t + " ");
			
			for (int i = 0; i < N; i++) {
				System.out.print(result[i] + " ");
			}
			
			System.out.println();
		}
	}

}
