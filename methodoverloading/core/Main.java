package methodoverloading.core;

public class Main {
    
    public static void main(String[] args) {
        calculateScore("Tim", 500);
        calculateScore(500);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.printf("Player %s scored %d points.\n", playerName, score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.printf("Unnamed player scored %d points.\n", score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.printf("No player name, no player score.\n");
        return 0;
    }
}
