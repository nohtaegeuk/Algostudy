package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class 괄호짝짓기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("괄호짝짓기.txt"));
		Scanner sc = new Scanner(System.in);
        int T = 10;
        
        char[] L = {'(', '{', '[', '<'};
        char[] R = {')', '}', ']', '>'};
        
        for(int tc = 1; tc<=10; tc++) {
            int N = sc.nextInt();
            String s = sc.next();    
            Stack<Character> st = new Stack<>();
    
            loop: for(int i = 0; i<s.length(); i++) {
                for(int j = 0; j<L.length; j++) {
                    if(s.charAt(i) == L[j]) {
                        st.push(s.charAt(i));
                        break;
                    }
                    if(s.charAt(i) == R[j]) {
                        if(st.peek() == L[j]) {
                            st.pop();
                            break;
                        }
                        break loop;    
                    }    
                }
            }
            
            System.out.print("#" + tc + " ");
            if(st.empty())
                System.out.println(1);
            else
                System.out.println(0);
        }
	}

}
