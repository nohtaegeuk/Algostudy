package 백준알고리즘;

import java.util.Scanner;

public class baekjoon분해합 {

	static int n;
	static int sum;
	static int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        n = in.nextInt();
        result = 0;
 
		
		for(int i = 0; i < n; i++) {
			
			int num = i;
			int sum = 0;	
			
			while(num != 0) {
				sum += num % 10;	
				num /= 10;
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
	}

}
