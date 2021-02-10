package 알고리즘swea;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 중위순회 {

	
	static int n;
	static char[] arr;
	
	public static void inOrder(int i) {
		// TODO Auto-generated method stub
		if(i > n) return;
		inOrder(2 * i);
		System.out.print(arr[i]);
		inOrder(2 * i + 1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.setIn(new FileInputStream("중위순회.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			
			n = Integer.parseInt(br.readLine());
			arr = new char[n + 1];
			
			for (int i = 1; i <= n; i++) {
				StringTokenizer tk = new StringTokenizer(br.readLine());
				tk.nextToken();
				arr[i] = tk.nextToken().charAt(0);
			}
			
			System.out.print("#" + t + " ");
			
			inOrder(1);
			System.out.println();
		}
	}

	

}
