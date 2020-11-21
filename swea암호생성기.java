package 알고리즘공부;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea암호생성기 {

	static int count;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("암호생성기.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			
			count = 1;
			
			Queue<Integer> que = new LinkedList<Integer>();
			int testcase = sc.nextInt();
			
			for (int i = 0; i < 8; i++) {
				que.offer(sc.nextInt());
			}
			
			while(true) {
				int num = que.poll() - count++;
				
				if(num > 0) {
					que.offer(num);
				} else {
					que.offer(0);
					break;
				}
				
				if(count == 6) {
					count = 1;
				}
				
				
			}
			
			System.out.print("#" + testcase + " ");
			
			for (int i = 0; i < 8; i++) {
				System.out.print(que.poll() + " ");
			}
			
			System.out.println();
			
		}
		
	}

}
