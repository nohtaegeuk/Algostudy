package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 성공적인공연기획 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("성공적인공연기획.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			String str = sc.next();
            int cur = 0;
            int result = 0;
            for(int i=0; i<str.length(); i++) {
                int add = str.charAt(i)-48;
                if( cur >= i ) {
                    cur += add;
                }
                else {
                	result += i - cur;
                    cur = i + add;
                }
            }
            System.out.format("#%d %d\n", t, result);
		}
	}

}
