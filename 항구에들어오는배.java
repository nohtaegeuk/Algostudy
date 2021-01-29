package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class 항구에들어오는배 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("항구에들어오는배.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int n = sc.nextInt();
			int[] arr = new int [n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			ArrayList <Integer> l = new ArrayList();
			
			for (int i = 1; i < n; i++) {
				int tmp = arr[i] - arr[0];
				int flag = 0;
				for (int j = 0; j < l.size(); j++) {
					
					if(tmp % l.get(j) == 0) {
						flag = 1;
						break;
					}
				}
				
				if(flag == 0) {
					l.add(tmp);
				}
			}
			
			System.out.println("#" + t + " " + l.size());
		}
	}

}
