package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea화섭이의정수나열 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("화섭이의정수나열.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			String str = "";
			
			for (int i = 0; i < N; i++) {
				str += Integer.toString(sc.nextInt());
			}
			
			for (int i = 0; i < 1000 ; i++) {
				if(!str.contains(Integer.toString(i))) {
					System.out.println("#" + t + " " + i);
					break;
				}
			}
		}
	}	

}
