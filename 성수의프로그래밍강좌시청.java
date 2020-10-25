package 알고리즘공부;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


class 성수의프로그래밍강좌시청 {
   static int N;
   static int K;
   static int[] arr;
   static double answer;
   
   public static void main(String args[]) throws Exception {
     
      Scanner sc = new Scanner(System.in);
      int T;
      T = sc.nextInt();
    

      for (int test_case = 1; test_case <= T; test_case++) {
         N = sc.nextInt();
         K = sc.nextInt();
         answer = 0;
         arr = new int[N];
         for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
         }
         
         Arrays.sort(arr);
         
         for(int i = arr.length-K; i < arr.length; i++) {
            answer = (double)(answer + arr[i]) / 2;
         }
         
         System.out.printf("#" + test_case + " %6f", answer);
         System.out.println();
      }
   }
   
}