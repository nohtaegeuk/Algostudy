package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sweaFlatten {

	
	static int [] arr = new int [100];
	static int max;
	static int min;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Flatten.txt"));
		Scanner sc = new Scanner(System.in);
		
		//int T = sc.nextInt();
		
		for (int t = 1; t <= 10; t++) {
			
			int N = sc.nextInt(); // 덤프 횟수 입력
			
			for (int i = 0; i < 100; i++) {
				arr[i] = 0; // 배열을 초기화
			}
			
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt(); // 배열에 숫자 입력
			}
			
			max = 0; 
			min = 0;
			
			for (int i = 0; i < N; i++) {
				
				Arrays.sort(arr);
				
				max = arr[99]-1;
				min = arr[0]+1;
				
				arr[99] = max;
				arr[0] = min;
				
			}
					
			Arrays.sort(arr);
			
			int result = arr[99] - arr[0];
			
			System.out.println("#" + t + " " + result);
			
		}
	}

}
