package ayush;

public class Main {

    public static void main(String[] args) {
        int score = 800;

        int highScore = calculateScore(true, score, 5, 100);
        System.out.println("Your Final Score = " + highScore);
        int levelCompleted = 8;

        highScore = calculateScore(true, 1000, levelCompleted, 200);
        System.out.println("Your Final Score = " + highScore);


        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Ayush", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ram", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mohit", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Golu", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String Name, int Position) {
        System.out.println(Name + " managed to get into position " + Position + " on the high score table");
    }

    public static int calculateHighScorePosition(int Score) {
        //  if(Score>=1000){
        //      return 1;
        //  }else if(Score>=500){
        //     return 2;
        // }else if(Score>=100){
        //   return 3;
        // }
        //return 4;


        int position=4;
        if (Score>=1000){
            position=1;}
        else  if (Score>=500){
            position=2;}
        else if(Score>=100){
            position=3;}
        return  position;
    }
}


