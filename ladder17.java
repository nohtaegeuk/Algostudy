package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder17 {

	static int testcase;
	static int ladder [][] = new int[100][100];
	static boolean find = false;
	static int result;
	
	public static void findresult(int i, int j) {
		// TODO Auto-generated method stub
		boolean visit [][] = new boolean [100][100];
		
		visit[i][j] = true;
		
		if(ladder[i][j] == 2) {
			find = true;
		}
		
		while(i < 100) {
			
			if(j-1 >=0 && ladder[i][j-1] == 1 && visit[i][j-1] == false) {
				j--;
			} else if(j+1<100 && ladder[i][j+1] == 1 && visit[i][j+1] == false) {
				j++;
			} else {
				i++;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("ladder1.txt"));
		Scanner sc = new Scanner(System.in);
		
		//그냥 10번 반복
		for (int t = 1; t <= 10; t++) {
			
			testcase = sc.nextInt(); //테케입력
			find = false;
			result = 0;
			
			//초기화
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = -1;
				}
			}
			
			// 사다리입력
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();
				}
			}
			
			for (int col = 0; col < 100; col++) {
				if(ladder[0][col] == 1) {
					
					findresult(0,col);
					
					if(find) {
						result = col;
						break;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
			
			
		}
	}

	

}
