package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder2 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("ladder2.txt"));
		Scanner sc = new Scanner(System.in);
		for(int t = 1; t <= 10; t++) {
			int tc = sc.nextInt();
			int[][] a = new int[100][100];
			int min = 10001;
			int idx = 0;
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < 100; i++) {
				if(a[0][i] == 1) {
					int[][] v = new int[100][100];
					int x = 0;
					int y = i;
					int cnt = 0;
					while(x < 99) {
						v[x][y] = 1;
						if(y - 1 >= 0 && v[x][y - 1] == 0 && a[x][y - 1] > 0) {
							y--;
						}
						else if(y + 1 < 100 && v[x][y + 1] == 0 && a[x][y + 1] > 0) {
							y++;
						}
						else if(x + 1 < 100 && v[x + 1][y] == 0 && a[x + 1][y] > 0){
							x++;
						}
						cnt++;
					}
					if(cnt < min) {
						min = cnt;
						idx = i;
					}
				}
			}
			System.out.println("#" + t + " " + idx);
		}
	}
}