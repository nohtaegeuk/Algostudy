package boDay04;

public class 문자찍기 {
	public static void main(String[] args) {
		int cnt=1;
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(cnt++ + " ");
			}
			System.out.println();
		}
		
		char ch = 'A';
		for (int i = 0; i < 5; i++) {
			// 공백 루프
			for (int j = 4-i; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
