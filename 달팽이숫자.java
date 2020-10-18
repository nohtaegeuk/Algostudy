import java.util.Arrays;
import java.util.Scanner;

public class 달팽이숫자 {
	
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =  sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			
			int cr = 0;
			int cc = 0;
			
			int input = 1;
			map[cr][cc] = input;
			input++;
			
			for (int i = 0; i < 2*N-1; i++) {
				while(true) {
					int nr = cr + dr[i%4];
					int nc = cc + dc[i%4];
					//System.out.println(nr + " " + nc);
					if(nr >= 0 && nc >=0 && nr < N && nc < N && map[nr][nc] == 0) {
						map[nr][nc] = input;
						//System.out.println(map[nr][nc]);
						input++;
					} else {				
						break;
					}
					cr = nr;
					cc = nc;
				}
				
			}
			
			System.out.println("#" + tc);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					sb.append(map[i][j]).append(" ");
				}
				sb.append("\n");
			}
			
			sb.delete(sb.length()-1, sb.length());
			System.out.println(sb);
		}
		
		
	}
}
