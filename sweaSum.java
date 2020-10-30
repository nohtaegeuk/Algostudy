package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sweaSum {

	
	static int [][] arr = new int [100][100];
	static int [] sum1 = new int [100];
	static int [] sum2 = new int [100];
	static int [] sum3 = new int [1];
	static int [] sum4 = new int [1];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Sum.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			int N = sc.nextInt();
			for (int i = 0; i < 100; i++) {
				sum1[i] = 0;
				sum2[i] = 0;
			}
			
			for (int i = 0; i < 1; i++) {
				sum3[i] = 0;
			}
			for (int i = 0; i < 1; i++) {
				sum4[i] = 0;
			}
			
			
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					
					arr[i][j] = sc.nextInt(); // 숫자입력
				}
			}
			
			
			for (int i = 0; i < 100; i++) {
				
				for (int j = 0; j < 100; j++) {
					sum1[i] += arr[i][j];
				}
				
			}
			
			for (int i = 0; i < 100; i++) {
				
				for (int j = 0; j < 100; j++) {
					sum2[i] += arr[j][i];
				}
				
			}
			
			
			
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 100; j++) {
					sum3[i] += arr[j][j]; // 정방향 대각선
				} 
			}
			
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 100; j++) {
					sum4[i] += arr[j][99-j]; // 역방향 대각선
				}
			}
				
			
			
			Arrays.sort(sum1);			
			Arrays.sort(sum2);	
			
			int result = Math.max(sum1[99],Math.max(sum2[99], Math.max(sum3[0], sum4[0])));
			
			System.out.println("#" + t + " " + result);
			
			
		}
	}

}
