package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 영준이의카드카운팅 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("영준이의카드카운팅.txt"));
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++) {
			String str = sc.next();
			int[] s = new int[14];
			int[] d = new int[14];
			int[] h = new int[14];
			int[] c = new int[14];
			
			int s_cnt = 0;
			int d_cnt = 0;
			int h_cnt = 0;
			int c_cnt = 0;
		
			
			for(int i = 0; i < str.length() / 3; i++) {
				String shape = str.substring(3*i, 3*i+1);
				int num = Integer.valueOf(str.substring(3*i + 1, 3*i + 3));
				if(shape.equals("S")) {
					s[num]++;
				}
				else if(shape.equals("D")) {
					d[num]++;
				}
				else if(shape.equals("H")) {
					h[num]++;
				}
				else if(shape.equals("C")) {
					c[num]++;
				}
			}
			int flag = 0;
			for(int i = 1; i < 14; i++) {
				if(s[i] > 1 || d[i] > 1 || h[i] > 1 || c[i] > 1) {
					flag = 1;
					System.out.println("#" + t + " " + "ERROR");
					break;
				}
				if(s[i] == 0)
					s_cnt++;
				if(d[i] == 0)
					d_cnt++;
				if(h[i] == 0)
					h_cnt++;
				if(c[i] == 0)
					c_cnt++;
			}
			if(flag == 0) {
				System.out.println("#" + t + " " + s_cnt + " " + d_cnt + " " + h_cnt + " " + c_cnt);
			}
		}
	}
}