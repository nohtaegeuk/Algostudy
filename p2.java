import java.util.Scanner;

public class p2 {

	private static void solution(int day, int width, int[][] blocks) {
	    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		int[] proj = new int[width];
		int used = 0;
		for(int proc = 0; proc < day; proc++) {
			for(int blcok = 0; blcok < width; blcok++) {
				proj[blcok] += blocks[proc][blcok];
			}
			
			for(int blcok = 0; blcok < width; blcok++) {
				int leftTop = proj[blcok];
				int rightTop = proj[blcok];
				
				int leftPoint = blcok - 1;
				int rightPoint = blcok + 1;
				while(leftPoint >= 0) {
					if(leftTop < proj[leftPoint]) {
						leftTop = proj[leftPoint];
					}
					leftPoint--;
				}
				
				while(rightPoint < width) {
					if(rightTop < proj[rightPoint]) {
						rightTop = proj[rightPoint];
					}
					rightPoint++;
				}
				
				int height = (leftTop > rightTop) ? rightTop : leftTop;
				
				used += height - proj[blcok];
				proj[blcok] = height;
				
			}
		}
		
		System.out.println(used);
	  }
	  
	  private static class InputData {
	    int day;
	    int width;
	    int[][] blocks;
	  }

	  private static InputData processStdin() {
	    InputData inputData = new InputData();

	    try (Scanner scanner = new Scanner(System.in)) {
	      inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));      
	      inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
	      
	      inputData.blocks = new int[inputData.day][inputData.width];
	      for (int i = 0; i < inputData.day; i++) {
	        String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
	        for (int j = 0; j < inputData.width; j++) {
	          inputData.blocks[i][j] = Integer.parseInt(buf[j]);
	        }
	      }
	    } catch (Exception e) {
	      throw e;
	    }

	    return inputData;
	  }

	  public static void main(String[] args) throws Exception {
	    InputData inputData = processStdin();

	    solution(inputData.day, inputData.width, inputData.blocks);
	  }

}
