package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sweaView {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("View.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int[] building = new int [N]; 
			
			int count = 0;
			
			for (int i = 0; i < N; i++) {
				building[i] = sc.nextInt();
			}
			
			int max = 0;
			
			for (int i = 2; i < N-2; i++) {
				max = Math.max(building[i-2], Math.max(building[i-1], Math.max(building[i+1], building[i+2])));
				if(building[i] - max >0) {
					count += building[i] - max;
				}
			}
			
			System.out.println("#" + t + " " + count);
			
			
			
		}
		
	}

}
