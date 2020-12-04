package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea상원이의연속합 {

	static int N;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("상원이의연속합.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			count = 0;
			
			
			
			for (int i = 1; i <= N; i++) {
				
				int sum = 0;
				
				for (int j = i; j <= N; j++) {
					
					sum += j;
					if(sum == N) {
						count++;
						break;
					} else if(sum > N) {
						
					}
					
				}
				
				
			}
			
			System.out.println("#" + t + " " + count);
			
			
			
		}
	}

}
