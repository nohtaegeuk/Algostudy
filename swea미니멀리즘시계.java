package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea미니멀리즘시계 {

	static int deg;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("미니멀리즘시계.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			deg = sc.nextInt();
			
			if(deg == 0 || deg == 360) {
				System.out.println("#" + t + " " + "0" + " " + "0");
			} else{
				
				System.out.println("#" + t + " " + deg*2/60 + " " + deg*2%60);
			}
			
			
			
		}
	}

}
