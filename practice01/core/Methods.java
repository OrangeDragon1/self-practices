package practice01.core;

public class Methods { 

    public static void main(String[] args) {

        int fred = calculateHighScorePosition(1200);
        displayHighScorePosition("fred", fred);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.printf("%s managed to get into position %d on the high score table.\n", playerName, highScorePosition);

    }
    
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1; 
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }
}
