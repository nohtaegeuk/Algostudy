package algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea���޷� {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("���޷�.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt(); // ���� ũ�� �Է�
			int[][] map = new int[N][N]; // ���� ũ�⸸ŭ 2���� �迭 ������ֱ�
			
			for (int i = 0; i < N; i++) {
				String str = sc.next(); // ���Ⱑ ���� ���ڿ��� �Է��� �ް�
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0'; // ���ڿ����� 0��ŭ�� ���ڰ��� ���ָ� ���ڷ� map�� �����
				}
			}
			
			
			
			
			
			
			
			
			
		}
	}

}
