package practice01.core;

public class IfElse {

    public static void main(String[] args) {
        
        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.printf("Your final score is %d.\n", finalScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    
    }
}   
