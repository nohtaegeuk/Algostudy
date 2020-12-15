package 알고리즘공부;

import java.util.Arrays;

public class swea빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "5329053995535987827332679340558347453272569584";
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int c = str.charAt(i) - '0';
			arr[c]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) continue;
			System.out.println(i + ":" + arr[i]);
		}
		
		
	}

}
