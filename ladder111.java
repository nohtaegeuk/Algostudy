import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder111 {

    static int testcase;
    static int ladder [][] = new int [100][100];
    static int result;
    static int dx[] = {-1,0,0};
    static int dy[] = {0,1,-1};
    static int cur_x;
    static int cur_y;

    public static void findResult(int i, int j) {
        // TODO Auto-generated method stub

        for (int k = 0; k < 3; k++) {

            cur_x = i + dx[k];
            cur_y = j + dy[k];

            if(ladder[cur_x][cur_y] == 1 && cur_x >=0 && cur_x<100 && cur_y> 0 ){
                findResult(cur_x, cur_y);
            } else if(cur_y == 0){
                result = cur_y;
            }

        }


    }


    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        System.setIn(new FileInputStream("ladder11.txt"));
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {

            testcase = sc.nextInt();
            result = 0;

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    ladder[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 100; i++) {
                if(ladder[i][99] == 2){
                    findResult(i,99);
                }
            }



            System.out.println("#" + t + " " + result);


        }
    }
}
