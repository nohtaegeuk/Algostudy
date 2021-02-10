package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder15 {

	
	static int t;
	static int result;
	static int ladder [][] = new int [100][100];
	static boolean find = false;
	
	public static void findresult(int i, int j) {
		// TODO Auto-generated method stub
		
		boolean visited [][] = new boolean[100][100];
		
		while(i < 100) {
		
			visited[i][j] = true;
			
			if(ladder[i][j] == 2) {
				find = true;
				break;
			}
			
			if(j-1>=0 && ladder[i][j-1] == 1 && visited[i][j-1] == false) {
				j--;
			} else if(j+1<100 && ladder[i][j+1] == 1 && visited[i][j+1] == false) {
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
		
		for (int t = 1; t <= 10; t++) {
			
			t = sc.nextInt();
			result = 0;
			find = false;
			
			for (int row = 0; row < 100; row++) {
				for (int col = 0; col < 100; col++) {
					ladder[row][col] = sc.nextInt();
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
