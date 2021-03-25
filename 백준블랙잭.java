package 백준알고리즘;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 블랙잭 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("블랙잭.txt"));
		Scanner sc = new Scanner(System.in);
		
		//입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int arr[] = new int [n];
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n-2; i++) {
			
			for (int j = i+1; j < n-1; j++) {
				
				for (int j2 = j+1; j2 < n; j2++) {
					
					sum = arr[i] + arr[j] + arr[j2];
					
					if(sum <= m) {
						
						if(sum > result) {
							result = sum;
						}
					}
				}
			}
		}
		
		System.out.println(result);
		
	}

}
