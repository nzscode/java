package Section6;

import java.util.Arrays;

public class HighScore6_5 {
    public static void main(String[] args) {
        
        int highScore = 0;

        int[] scores = {randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum()};

        System.out.print("Here are the scores: " + Arrays.toString(scores) + ".");


        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= highScore){
                highScore = scores[i];
            }
        }System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }
    public static int randomNum(){
        double num = Math.random()*49999 + 1;
        return (int) num;
    }

}
