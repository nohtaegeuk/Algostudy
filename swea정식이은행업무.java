package 알고리즘공부;

import java.util.Scanner;
import java.io.FileInputStream;

class swea정식이은행업무 {
	public static int[] twoarr;
	public static int[] threearr;

	public static int N, M;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();

		for (int testcase = 1; testcase <= T; testcase++) {

			int result = 0;
			String twoBase = sc.next();
			String threeBase = sc.next();

			N = twoBase.length();
			M = threeBase.length();

			twoarr = new int[N];
			threearr = new int[M];

			for (int i = 0; i < N; i++) {
				twoarr[i] = (int) (twoBase.charAt(i) - '0');
			}

			for (int i = 0; i < M; i++) {
				threearr[i] = (int) (threeBase.charAt(i) - '0');
			}

			result = algo();

			System.out.println("#" + testcase + " " + result);

		}
	}

	public static int tenBase(int[] input, int baseType) {

		int result2 = 0;

		for (int i = 0; i < input.length; i++) {
			result2 += pow(baseType, input.length - 1 - i) * input[i];
		}
		return result2;

	}

	public static int algo() {

		int[] value = new int[N];
		int[][] value2 = new int[M][2];

		for (int i = 0; i < N; i++) {

			int[] changed = twoarr.clone();

			if (twoarr[i] == 0) {
				changed[i] = 1;
			}

			else {
				changed[i] = 0;
			}

			value[i] = tenBase(changed, 2);

		}

		for (int j = 0; j < M; j++) {

			int[] changed2 = threearr.clone();

			for (int changeCnt = 0; changeCnt < 2; changeCnt++) {

				if (changed2[j] == 0) {

					changed2[j] = 1;
				}

				else if (changed2[j] == 1) {

					changed2[j] = 2;
				}

				else {

					changed2[j] = 0;
				}

				value2[j][changeCnt] = tenBase(changed2, 3);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				for (int cnt = 0; cnt < 2; cnt++)
					if (value[i] == value2[j][cnt])
						return value[i];

		}

		return -1;
	}

	public static int pow(int a, int b) {

		int ret = 1;

		for (int i = 0; i < b; i++) {
			ret *= a;
		}
			
		return ret;
	}

}
