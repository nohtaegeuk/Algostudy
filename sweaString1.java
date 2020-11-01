package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sweaString1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("String.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			int N = sc.nextInt();
			String find = sc.next();
			String str = sc.next();
			int count = 0;
			
			
			for (int i = 0; i <= str.length() - find.length(); i++) {
				
				String find2 = str.substring(i , i + find.length());
				
				if(find2.equals(find)) {
					count++;
				}
				
				
				
			}
			
			System.out.println("#" + t + " " + count);
			
		}
	}

}
