package 알고리즘swea;

import java.io.FileInputStream;
import java.util.Scanner;


public class ladder5
{
    static int [][] arr = new int [101][101];
    //static int [][] check = new int [101][101];
    static int answer = 0;

    static void find(int i, int j, int start) {
        //check[i][j] = 1;
        if (j > 0 && arr[i][j-1] == 1) { //좌를 살피자
            arr[i][j] = 0;
        	find(i,j-1, start);
        }
        else if (j < 99 && arr[i][j+1] == 1) {//우를 살피자
            arr[i][j] = 0;
        	find(i, j+1, start);
        }
        else if (i > 0  && arr[i-1][j] == 1) { //위로 가
        	arr[i][j] = 0;
        	find(i-1, j, start);
        }
        else if (i == 0) {
            answer = j;
        }
    }


    public static void main(String args[]) throws Exception
    {
    	System.setIn(new FileInputStream("ladder1.txt"));
        Scanner sc = new Scanner(System.in);
        int T = 10;



        for(int test_case = 1; test_case <= T; test_case++)
        {
            sc.nextInt();
            //초기화
           for (int i = 0; i < 100; i++) {
               for (int j = 0; j < 100; j++) {
                   arr[i][j] = -1;
               }
           }
           
           answer = 0;
           
           for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                   arr[i][j] = sc.nextInt();
                   //System.out.print(arr[i][j]);
                }
                //System.out.println();
            }
           
           for (int j = 0; j < 100; j++) {
               if(arr[99][j] == 2) {
                   find(99, j, j);
               }
           }

           System.out.println("#"+test_case+" "+ answer);


        }
    }
}