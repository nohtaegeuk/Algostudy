
import java.util.Scanner;

public class sweaRC카 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[] D = new int[N];  
			int[] S = new int[N];  
			
			for (int i = 0; i < N; i++) {
				D[i] = sc.nextInt();
				if(D[i] == 0) {
					S[i] = 0;
				} else {
					S[i] = sc.nextInt();
				}
			}
			
			int result = 0;
			int speed = 0;
			
			for (int i = 0; i < N; i++) {
				if(D[i] == 1) {
					speed = speed + S[i];
					result = result + speed;
				} else if(D[i] == 2) {
					if(S[i] > speed) {
						speed = 0;
					} else {
						speed = speed - S[i];
					}
					result = result + speed;
				} else if(D[i] == 0){
					result = result + speed;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}

}
