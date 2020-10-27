package algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea보급로 {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("보급로.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt(); // 지도 크기 입력
			int[][] map = new int[N][N]; // 지도 크기만큼 2차원 배열 만들어주기
			
			for (int i = 0; i < N; i++) {
				String str = sc.next(); // 띄어쓰기가 없는 문자열로 입력을 받고
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0'; // 문자열에서 0만큼의 문자값을 빼주면 숫자로 map에 저장됨
				}
			}
			
			
			
			
			
			
			
			
			
		}
	}

}
