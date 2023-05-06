package Section5;

import java.util.Scanner;

public class Guess5_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int userGuess = scan.nextInt();

        double roll = Math.random()*5+1;
        int compChoice = (int) roll;

        while (userGuess != compChoice){
            System.out.print("Next Guess: ");
            userGuess = scan.nextInt();
        }System.out.println("You won!");
       
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
