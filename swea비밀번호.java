package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class swea비밀번호 {

	static int N;
	static int arr [] = new int [100];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("비밀번호.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			N = sc.nextInt();
			String str = sc.next();
			
			LinkedList <Integer> list = new LinkedList();
			
			for (int i = 0; i < N; i++) {
				int tmp = str.charAt(i) - '0';
				list.add(tmp);
			}
			
			int i = 1;
			
			boolean flag = true;
			
			while(true) {
				if(list.get(i) == list.get(i-1)) {
					list.remove(i);
					list.remove(i-1);
					i=1;
				} else {
					i++;
				}
				
				if(i >= list.size()) {
					break;
				}
			}
			
			System.out.print("#" + t + " ");
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j));
			}
			System.out.println();
			
		}
	}

}
