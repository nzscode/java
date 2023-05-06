package Section4;

import java.util.Scanner;

public class DiceJack4_5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please pick three numbers from 1 to 6.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        int randNum1 = diceRoll();
        int randNum2 = diceRoll();
        int randNum3 = diceRoll();

        int sum = num1 + num2 + num3;
        int randSum = randNum1 + randNum2 + randNum3;

        if (isLessThan(num1, num2, num3) || isGreaterThan(num1, num2, num3)) {
            System.out.print("You entered number(s) outside the range.");
            System.exit(0);
        }

        System.out.println("You rolled: " + randNum1 + ", " + randNum2 + ", " + randNum3);
        System.out.println("Your sum is: " + sum + ", The Computer's sum is: " + randSum);

        if (gameWon(sum, randSum)){
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }

    }


    public static int diceRoll() {
        return ((int) (Math.random() * 6 + 1));
    }

    /**
     * Function name: isLessThan
     *
     * @param num1 (int) from user input.
     * @param num2 (int) from user input.
     * @param num3 (int) from user input.
     * @return True/False
     * <p>
     * Inside Function:
     * 1. if num1 is less than 1 OR num 2 is less than 1 OR num3 is less than 1 returns True or else returns False.
     */
    public static Boolean isLessThan(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    /**
     * Function name: isGreaterThan
     *
     * @param num1 (int) from user input.
     * @param num2 (int) from user input.
     * @param num3 (int) from user input.
     * @return True/False
     * <p>
     * Inside Function:
     * 1. if num1 is greater than 6 OR num 2 is greater than 6 OR num3 is greater than 6 returns True or else returns False.
     */
    public static Boolean isGreaterThan(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    /**
     * Function Name: gameWon.
     * @param sum (int) Sum of user input.
     * @param randSum (int) Sum of dice rolls.
     * @return True/False
     *
     * Inside Function:
     *  1. if randSum is greater than sum, and the difference is 3.
     */
    public static Boolean gameWon(int sum, int randSum) {
        return (randSum < sum & ((sum - randSum) < 3));
    }


}
