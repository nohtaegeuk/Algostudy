package 알고리즘swea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder1
{
    public static int ladder[][] = new int[100][100];
    public static boolean find = false;

    public static void main(String[] args) throws FileNotFoundException
    {
    	System.setIn(new FileInputStream("ladder1.txt"));
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++)
        {
            int tc_cnt = sc.nextInt();
            int result = 0;
            find = false;

            
            for (int row = 0; row < 100; row++)
            {
                for (int col = 0; col < 100; col++)
                {
                    ladder[row][col] = sc.nextInt();
                }
            }
            
            for (int col = 0; col < 100; col++)
            {
                if (ladder[0][col] == 1)
                {
                    findX(0, col);

                    if (find)
                    {
                        result = col;
                        break;
                    }
                }
            }
            System.out.println("#" + tc_cnt + " " + result);
        }
    }
    public static void findX(int i, int j)
    {
        boolean visited[][] = new boolean[100][100];
        
        while(i<100)
        {
            visited[i][j] = true;		
            if(ladder[i][j] == 2)
            {
                find = true;
                break;
            }
            if(j-1>=0 && ladder[i][j - 1] == 1 && visited[i][j - 1] == false)		            {
                j--;
            }
            else if(j+1<100 && ladder[i][j + 1] == 1 && visited[i][j + 1] == false)	            {
                j++;
            }
            else
            {										
                i++;
            }
        }
    }
}