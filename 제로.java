package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class 제로 {

	static int K;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("제로.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			K = sc.nextInt();
			int result = 0;
			Stack<Integer> stack = new Stack<Integer>();
			
			for (int i = 0; i < K; i++) {
				
				int num = sc.nextInt();
				if(num == 0) {
					if(!stack.isEmpty()) {
						stack.pop();
					}
				} else {
					stack.push(num);
				}
			}
			
			while(!stack.isEmpty()) {
				result += stack.pop();
			}
			
			System.out.println("#" +t + " " + result);
		}
	}

}
