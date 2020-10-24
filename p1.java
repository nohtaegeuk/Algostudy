import java.util.HashMap;
import java.util.Scanner;

public class p1 {

	 private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
		    // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
		 	char[] seated = new char[numOfAllPlayers];
		 	HashMap<Character, Integer> cnt = new HashMap<Character, Integer>(); // 술래 걸리 횟수
		 	for(int i = 0; i < numOfAllPlayers; i++) {
		 		seated[i] = (char) ('A' + i);
		 		cnt.put(seated[i], i == 0 ? 1 : 0);
		 	}
		 	
		 	int point = 1; // 술래 위치
		 	for(int play = 0; play < numOfGames; play++) {
		 		int nextPoint = point + numOfMovesPerGame[play];
		 		if(nextPoint < 1) {
		 			nextPoint = numOfAllPlayers + (nextPoint - 1);
		 		} else if(nextPoint >= numOfAllPlayers) {
		 			nextPoint = (nextPoint % numOfAllPlayers) + 1;
		 		}
		 		boolean cantCatch = false;
		 		for(int i = 0; i < numOfQuickPlayers; i++) {
		 			if(namesOfQuickPlayers[i] == seated[nextPoint]) {
		 				cantCatch = true;
		 			}
		 			if(cantCatch) {
		 				break;
		 			}
		 		}
		 		if(!cantCatch) {
		 			char tmp = seated[0];
		 			seated[0] = seated[nextPoint];
		 			seated[nextPoint] = tmp;
		 			cantCatch = false;
		 		}
		 		cnt.put(seated[0], cnt.get(seated[0]) + 1);
		 		point = nextPoint;
		 	}
		 	
		 	
		 	for(int print = 1; print < seated.length; print++) {
		 		System.out.println(seated[print] + " " + cnt.get(seated[print]));
		 	}
		 	System.out.println(seated[0] + " " + cnt.get(seated[0]));
		  }

		  private static class InputData {
		    int numOfAllPlayers;
		    int numOfQuickPlayers;
		    char[] namesOfQuickPlayers;
		    int numOfGames;
		    int[] numOfMovesPerGame;
		  }

		  private static InputData processStdin() {
		    InputData inputData = new InputData();

		    try (Scanner scanner = new Scanner(System.in)) {
		      inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

		      inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
		      inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
		      System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

		      inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
		      inputData.numOfMovesPerGame = new int[inputData.numOfGames];
		      String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
		      for(int i = 0; i < inputData.numOfGames ; i++){
		        inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
		      }
		    } catch (Exception e) {
		      throw e;
		    }

		    return inputData;
		  }

		  public static void main(String[] args) throws Exception {
		    InputData inputData = processStdin();

		    solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
		  }
}
