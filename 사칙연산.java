package 알고리즘swea;

import java.io.*;
import java.util.*;

public class 사칙연산 {
	static String[] vertex;
	static int[][] edge;
	static int n;
	static int[] visit;
	static Stack <Integer> nums;
	
	public static void op(String s) {
		if(s.equals("+")) {
			int a = nums.pop();
			int b = nums.pop();
			nums.push(b+a);
		}
		else if(s.equals("-")) {
			int a = nums.pop();
			int b = nums.pop();
			nums.push(b-a);
		}
		else if(s.equals("*")) {
			int a = nums.pop();
			int b = nums.pop();
			nums.push(b*a);
		}
		else if(s.equals("/")) {
			int a = nums.pop();
			int b = nums.pop();
			nums.push(b/a);
		}
		else {
			int num = Integer.parseInt(s);
			nums.push(num);
		}
	}
	
	public static void dfs(int x) {
		visit[x] = 1;
		
		for(int i = 1; i <= n; i++) {
			if(edge[x][i] == 1 && visit[i] == 0)
				dfs(i);
		}
		op(vertex[x]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int t = 1; t <= 10; t++) {
			n = Integer.parseInt(br.readLine());
			edge = new int[n + 1][n + 1];
			vertex = new String[n+1];
			visit = new int[n + 1];
			nums = new Stack<>();
			
			for(int i = 0; i < n; i++) {
				StringTokenizer tk = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(tk.nextToken());
				vertex[from] = tk.nextToken(); 
				
				for(int j = 0; j < 2; j++) {
					if(tk.hasMoreTokens()) {
						int to = Integer.parseInt(tk.nextToken());
						edge[from][to] = 1;
					}
				}
			}
			dfs(1);
			System.out.println("#" + t + " " + nums.pop());
		}
	}
}