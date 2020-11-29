package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea요일맞추기 {

	
	static int [] arr_m = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	static int [] arr_res = {4,5,6,0,1,2,3};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("요일맞추기.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int m = sc.nextInt();
			int d = sc.nextInt();
			int count = 0;
			
			for (int i = 1; i < m; i++) {
				count += arr_m[i];
			}
			
			count += d;
			count--;
			
			System.out.println("#" + t + " " + arr_res[count % 7]);
			
		}
	}

}
