import java.util.Scanner;

public class swea시각덧셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();
			int M = sc.nextInt();
			int H2 = sc.nextInt();
			int M2 = sc.nextInt();
			
			int result_H = (H + H2) % 12;
			int result_M = 0;
			if((M + M2) > 60) {
				result_M = (M + M2) % 60;
				result_H++;
			} else {
				result_M = M + M2;
			}
			
			
			System.out.println("#" + tc + " " + result_H + " " + result_M);
		}
		
	}

}
