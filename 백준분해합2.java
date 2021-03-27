package 백준알고리즘;

import java.util.Scanner;

public class 백준분해합2 {

	static int n;
	static int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
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
