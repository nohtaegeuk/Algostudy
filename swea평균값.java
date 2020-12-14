package 알고리즘공부;

public class swea평균값 {
	public static void main(String[] args) {
		int[] su = {34,55,27,67,45,82,68,99,77,18};
		
		int sum = 0;
		for (int i = 0; i < su.length; i++) {
			sum += su[i];
		}
		
		int avg = sum / su.length;
		
		System.out.println(avg);
		
		int minval = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < su.length; i++) {
			if(min > Math.abs(avg-su[i])) {
				
				min = Math.abs(avg-su[i]);
				minval = su[i];
			}
		}
		
		System.out.println(minval);
	}
}	
