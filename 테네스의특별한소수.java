package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 테네스의특별한소수 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("테네스의특별한소수.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] arr = new int[1000001];
		for(int i = 2; i < arr.length; i++) {
			int j = 2;
			while(true) {
				if(i * j > 1000000)
					break;
				arr[i * j] = 1;
				j++;
			}
		}
		
		for (int t = 1; t <= T; t++) {
			
			int d = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cnt = 0;
			if(a == 1)
				a = 2;
			for(int i = a; i <= b; i++) {
				if(arr[i] == 0) {
					String s = String.valueOf(i);
					for(int j = 0; j < s.length(); j++) {
						if((s.charAt(j) - '0') == d) {
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
	}

}
