import java.util.Scanner;
import java.util.Arrays;

public class 파리퇴치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] map = new int[N][N];
			int[][] tmp = new int[N][N];
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					
					for (int p = i; p < i+M; p++) {
						for (int q = j; q < j+M; q++) {
							
							if(p >= 0 && q >= 0 && p < N & q < N) {
								tmp[i][j] += map[p][q];
								//System.out.println(tmp[i][j]);
							}
						}
					}
				}
			}
			
			int max = tmp[0][0];
			
			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp.length; j++) {
					max = Math.max(max, tmp[i][j]);
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}

}
