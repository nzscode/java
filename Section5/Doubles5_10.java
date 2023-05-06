package Section5;

public class Doubles5_10 {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.

        int dice1 = diceRoll();
        int dice2 = diceRoll();

        while(dice1 != dice2 ){
            dice1 = diceRoll();
            System.out.print("\nDice 1: " + dice1);
            dice2 = diceRoll();
            System.out.print("\nDice 2: " + dice2 + "\n");
        } System.out.println("\nYou rolled Doubles");


    }public static int diceRoll(){
        double diceRoll = Math.random()*6 +1;
        return (int)diceRoll;
    }

}





