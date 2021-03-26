package 백준알고리즘;

import java.util.Scanner;

public class baekjoon덩치 {

	static int N;
	static int [] weight;
	static int [] tall;
	static int [] result;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		weight = new int [N];
		tall = new int [N];
		result = new int [N];
		
		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
			tall[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if( i == j ) {
					continue;
				} else if(weight[i] < weight[j] && tall[i] < tall[j]){
					result[i]++;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(++result[i]);
		}
		
		
	}

}
