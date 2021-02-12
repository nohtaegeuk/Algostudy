package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder111 {

	static int testcase;
	static int ladder [][] = new int [10][10];
	static boolean find;
	static int result;
	static boolean visit [][] = new boolean [10][10];
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("ladder111.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 1; t++) {
			
			testcase = sc.nextInt(); // 입력
			find = false;
			result = 0;
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					ladder[i][j] = sc.nextInt();
					visit[i][j] = false;
				}
			}
			
			
			
			for (int col = 0; col < 10; col++) {
				
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						visit[i][j] = false;
					}
				}
				
				if(ladder[0][col] == 1) {
					
					findResult(0,col);
					
					if(find) {
						result = col;
						break;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
			
			
		}
	}


	public static void findResult(int i, int j) {
		// TODO Auto-generated method stub
		
		visit[i][j] = true;
		
		if(ladder[i][j] == 2) {
			find = true;
			return;
		}
		
			if(j-1>=0 && ladder[i][j-1] == 1 && visit[i][j-1] == false) {
				findResult(i,j-1);
			} else if(j+1 < 10 && ladder[i][j+1]==1 && visit[i][j+1]==false) {
				findResult(i,j+1);
			} else if(i<9){
				findResult(i+1,j);
			}
		
		
	}

}

