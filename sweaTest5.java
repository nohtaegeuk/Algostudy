import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test5 {
	static int[] dr = {0, 1, 1, 1};
	static int[] dc = {1, 1, 0, -1};
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("Test5.txt"));
		Scanner sc = new Scanner(System.in);
		
		int len = 19;
		int[][] map = new int[len][len];
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int xx = 0;
		int yy = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if(map[i][j] == 1) {
					for(int k = 0; k < 4; k++) {
						int count = 1;
						xx = i + dr[k];
						yy = j + dc[k];
						
						if(xx >= 0 && xx < len && yy >= 0 && yy < len) {
							if(map[xx][yy] == 1) { 
								while(true) {
									count++;
									if(count == 5) {
										xx += dr[k];
										yy += dc[k];
										if(map[xx][yy] == 1) {
											break;
										}else {
											System.out.println(1);
											int x = i + 1;
											int y = j + 1;
											System.out.println(x + " " + y);
											sc.close();
											return;
										}
									}
									xx += dr[k];
									yy += dc[k];
									if(xx < 0 || xx >= len || yy < 0 || yy >= len || map[xx][yy] == 0 || map[xx][yy] == 2) {
										break;
									}
								}
							}
						} 
					}
				}
				else if(map[i][j] == 2) {
					for(int k = 0; k < 4; k++) {
						int count = 1;
						xx = i + dr[k];
						yy = j + dc[k];
						
						if(xx >= 0 && xx < len && yy >= 0 && yy < len) {
							if(map[xx][yy] == 2) {
								while(true) {
									count++;
									if(count == 5) {
										xx += dr[k];
										yy += dc[k];
										if(map[xx][yy] == 2) {
											break;
										}else {
											System.out.println(2);
											int x = i + 1;
											int y = j + 1;
											System.out.println(x + " " + y);
											sc.close();
											return;
										}					
									}
									xx += dr[k];
									yy += dc[k];
									if(xx < 0 || xx >= len || yy < 0 || yy >= len || map[xx][yy] == 0 || map[xx][yy] == 1) {
										break;
									}
								}
							}
						} 
					}
				}
			}
		}
		sc.close();
		System.out.println(0);
	}
}
