package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기자르기 {

	
	static int sum;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("쇠막대기자르기.txt"));
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		int T = sc.nextInt();
		
        for (int t = 1; t <= T; t++) {
            
        	sum = 0;
            String arr = sc.next();
            char[] arr2 = new char[arr.length()];
            
            for(int i = 0; i < arr.length(); i ++) {
                arr2[i] = arr.charAt(i);
            }
            for(int i = 0; i < arr.length(); i ++) {
                if(arr2[i] == '(') {
                    stack.push(arr2[i]);
                }
                if(arr2[i] == ')' && arr2[i-1] == '(') { 
                    stack.pop();
                    sum +=  stack.size();
                }
                if(arr2[i] == ')' && arr2[i-1] == ')') { 
                    stack.pop();
                    sum += 1;
                }
            }
            System.out.println("#" + t + " " + sum);
            
        } 
	}

}
