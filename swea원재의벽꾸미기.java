package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea원재의벽꾸미기 {

	static long N;
	static long A;
	static long B;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("원재의벽꾸미기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			
			long result1 = 100000;
			long result2 = 100000;
			
			for(long C=1; C<N/2; C++) {
				for(long R=C; R*C<=N; R++) {
	                   
					result1=A*(R-C)+B*(N-R*C);
	                    
	                   	if(result1<result2) {
	                    	result2=result1;
	                    }
	                }
	            }
			
			System.out.println("#" + t + " " + result2);
			
			
		}
	}

}
