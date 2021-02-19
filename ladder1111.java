package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ladder1111 {

    static int testcase;
    static int ladder [][] = new int [100][100];
    static int result;
    static int dx[] = {0,0,-1};
    static int dy[] = {-1,1,0};

    public static void findResult(int i, int j) {
        // TODO Auto-generated method stub

    	
        for (int k = 0; k < 3; k++) {

            int cur_x = i + dx[k];
            int cur_y = j + dy[k];

            if (cur_x == 0 && ladder[cur_x][cur_y] == 1) {
            	result = cur_y;
            	break;
            } else if (cur_x >= 0 && cur_y >= 0 && cur_x < 100 && cur_y < 100 && ladder[cur_x][cur_y] == 1) {
            	ladder[cur_x][cur_y] = 0;
            	findResult(cur_x, cur_y);
            	break;
            } else { // 0을 만났을 때
            	
            }
            

        }


        
    }


    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        System.setIn(new FileInputStream("ladder1.txt"));
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {

            testcase = sc.nextInt(); //입력
            result = 0;

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    ladder[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 100; i++) {
                if(ladder[99][i] == 2){
                    findResult(99,i);
                }
            }



            System.out.println("#" + t + " " + result);


        }
    }
}
