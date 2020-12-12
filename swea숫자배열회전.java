import java.util.Arrays;
import java.util.Scanner;

public class swea숫자배열회전 {

	static int N;
	static char[][]map;
	static char[][]tmp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			
			map = new char[N][N];
			tmp = new char[N][N];
			
			String[][] result = new String[N][3];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			
			turn(1);
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					result[i][0] = sb.append(tmp[i][j]).toString();
				}
				sb.setLength(0);
			}
			
			turn(2);

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//result[i][1] += tmp[i][j] * Math.pow(10, N-j-1);
					result[i][1] = sb.append(tmp[i][j]).toString();
					
				}
				sb.setLength(0);
			}

			turn(3);
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//result[i][2] += tmp[i][j] * Math.pow(10, N-j-1);
					result[i][2] = sb.append(tmp[i][j]).toString();
					
				}
				sb.setLength(0);
			}
			
			System.out.println("#" + tc);
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(result[i][j] + " ");	
				}
				System.out.println();
			}
			
		}
	}

	private static void turn(int a) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N; j++) {
				tmp[j][N-i] = map[i-1][j];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = tmp[i][j];
			}
		}
	}
}
