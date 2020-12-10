import java.util.Scanner;

public class swea돌던지기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[] loc = new int[N];
			for (int i = 0; i < loc.length; i++) {
				loc[i] = Math.abs(sc.nextInt());
			}
			
			int min = loc[0];
			for (int j = 0; j < loc.length; j++) {
				min = Math.min(min, loc[j]);
			}
			
			int cnt = 0;
			for (int i = 0; i < loc.length; i++) {
				if(loc[i] == min) {
					cnt++;
				}
			}
			
			System.out.println("# " + tc + " " + min + " " + cnt);
		}
	}

}
