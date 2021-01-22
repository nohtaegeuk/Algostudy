package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;


public class 시샘이의735게임 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("시샘이의735게임.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int i,j,k,result;
			
			int arr [] = new int [7];
			
			for (int l = 0; l < 7; l++) {
				arr[l] = sc.nextInt();
			}
			
			Set<Integer> set = new HashSet<Integer>();
            for(i=0; i<7; i++) {
                for(j=i+1; j<7; j++) {
                    for(k=j+1; k<7; k++) {
                        set.add( arr[i] + arr[j] + arr[k] );
                    }
                }
            }
            
            List<Integer> list = new ArrayList<Integer>(set);
            Collections.sort(list);
            result = list.get(list.size()-5);
            System.out.println("#" + t + " " + result);
		}
	}

}
