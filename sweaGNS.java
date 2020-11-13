package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sweaGNS {

	static int testcase;
	static int [] arr = new int [10];
	static String [] arr2 = {"ZRO" , "ONE" , "TWO" , "THR",  "FOR", "FIV", "SIX", "SVN", "EGT","NIN"};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("GNS.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			
			testcase = 0;
			String test = sc.next(); // #하고 숫자 입력
			testcase = sc.nextInt(); // 테스트케이스
			
			// 초기화
			for (int i = 0; i < 10; i++) {
				arr[i] = 0;
			}
			
			for (int i = 0; i < testcase; i++) {
				
				String str = sc.next();
				
				for (int j = 0; j < 10; j++) {
					
					if(str.equals(arr2[j])) {
						arr[j]++;
					}
				}
				
				
				
				
				
			}
			
			System.out.println("#" + t);
			
			for (int j = 0; j < 10; j++) {
				
				for (int j2 = 0; j2 < arr[j]; j2++) {
					
					System.out.print(arr2[j] + " ");
				}
				
				
				
			}
			
			System.out.println();
			
			
			
		}
	}

}
