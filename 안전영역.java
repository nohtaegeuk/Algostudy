package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class 안전영역 {
    public static int size;
    public static int[][] arr;
    
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;
    
    public static int cnt = 0;
    public static PriorityQueue<Integer> pq;
    
    public static int[] dy = {-1, 1, 0, 0}; 
    public static int[] dx = {0, 0, -1, 1}; 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        pq = new PriorityQueue<>();
        
        pq.offer(0);
        
        for(int i=0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(!pq.contains(arr[i][j]))pq.offer(arr[i][j]);
                min = (min > arr[i][j])?arr[i][j]:min;
                max = (max < arr[i][j])?arr[i][j]:max;
            }
        }
        
        while(!pq.isEmpty()) {
            int h = pq.poll();
            
            boolean[][] visited = new boolean[size][size];
            int tCnt = 0;
            
            for(int i=0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    if(!visited[i][j] && arr[i][j] > h) {
                        dfs(h,i,j,visited);
                        tCnt += 1;
                    }
                }
            }
            
           cnt = Math.max(cnt, tCnt);
        }
        System.out.println(cnt);
    }
    
    public static void dfs(int h, int y, int x, boolean[][] visited) {
        visited[y][x] = true;
        
        for(int i=0; i < 4; i++) {
            int yy = dy[i] + y;
            int xx = dx[i] + x;
            
            if(yy < 0 || xx < 0 || yy >= size || xx >= size) continue;
            if(arr[yy][xx] <= h) continue;
            if(visited[yy][xx]) continue;
            dfs(h, yy, xx, visited);
        }
    }
}
