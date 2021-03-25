package 백준알고리즘;

import java.util.Scanner;

public class baekjoon하노이탑이동순서1 {
    
	static int answer = 0;
	static int num;
    static StringBuilder sb = new StringBuilder();
	
    // from에 꽂혀있는 num개의 원반을 by를 거쳐 to로 이동한다.
    public static void hanoi(int num, int from, int by, int to) {
        
    	++answer;
        
    	if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            hanoi(num-1, from, to, by);
            sb.append(from + " " + to + "\n");
            hanoi(num-1, by, from, to);
        }	
    }
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        hanoi(num, 1, 2, 3);
        
        sb.insert(0, answer + "\n");
        System.out.println(sb.toString());
    }	
}
