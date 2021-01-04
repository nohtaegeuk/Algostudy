package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 문자열의거울상 {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("문자열의거울상.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
			String result = "";
            
            for (int i = str.length()-1; i >= 0; i--) {
                char ch = str.charAt(i);
                if(ch == 'b') {
                    result += 'd';
                }else if(ch == 'd') {
                    result += 'b';
                }else if(ch == 'q') {
                    result += 'p';
                }else {
                    result += 'q';
                }
            }
             
            System.out.println("#"+t+" "+result);

		}
	}

}
