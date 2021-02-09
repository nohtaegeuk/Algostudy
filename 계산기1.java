package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class 계산기1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("계산기1.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		for (int t = 1; t <= 10; t++) {
			
			int n = sc.nextInt();
			String str = sc.next();
			
			Stack<Character> st = new Stack();
			
			String result = "";
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c-'0'>=0 &&  c-'0'<=9) {
					result += String.valueOf(c);
				} else {
					if(st.isEmpty()) {
						st.push(c);
					} else {
						result += String.valueOf(st.pop());
						st.push(c);
					}
				}
			}
			
			while(!st.isEmpty()) {
				result += String.valueOf(st.pop());
			}
			
			Stack <Integer> st2 = new Stack();
			
			for (int i = 0; i < result.length(); i++) {
				
				char c = result.charAt(i);
				if(c-'0' >= 0 && c-'0' <= 9) {
					st2.push(c-'0');
				} else {
					int num1 = st2.pop();
					int num2 = st2.pop();
					st2.push(num1 + num2);
				}
			}
			
			System.out.println("#" + t + " " + st2.pop());
		}
	}

}
