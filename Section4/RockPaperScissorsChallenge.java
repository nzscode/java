package Section4;

import java.util.Scanner;

public class RockPaperScissorsChallenge {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String playGame = (scan.nextLine()).toLowerCase();
        if (userChoice(playGame)){
            System.out.println("Great!\nrock - paper - scissors, shoot!");
            String userSelection = (scan.nextLine().toLowerCase());
            String computerChoice = computerChoice();
            String result = result(userSelection, computerChoice);
            if (result.equals("INVALID CHOICE")){
                System.out.println(result);
                System.exit(0);
            }else{
                printResult(userSelection,computerChoice,result);
            }
        }else{
            System.out.print("Maybe another time...");
            System.exit(0);
        }



    /*Task 2: Set up the game
    

       • if the answer is yes: 
             – print: Great!
             – print: rock - paper - scissors, shoot!
             – pick up user's choice.

             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */
              

        scan.close();
    }

    public static Boolean userChoice(String playGame){
        return (playGame.equals("yes"));
    }

    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice(){
        int compChoice =  (int)(Math.random()*2)+1;
        return switch (compChoice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }



    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param userSelection (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String userSelection, String computerChoice) {
        String result = "";
        if ((userSelection.equals("rock") && computerChoice.equals("scissors")) ||
                (userSelection.equals("paper") && computerChoice.equals("rock")) ||
                (userSelection.equals("scissors") && computerChoice.equals("paper"))) {
            result = "You win!";
        }else if(userSelection.equals(computerChoice)){
            result = "It's a tie";
        }else if ((computerChoice.equals("rock") && userSelection.equals("scissors")) ||
                (computerChoice.equals("paper") && userSelection.equals("rock")) ||
                (computerChoice.equals("scissors") && userSelection.equals("paper"))){
            result = "You lose.";
        }else{
            result = "INVALID CHOICE";
        }

        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param userSelection (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */
    public static void printResult(String userSelection, String computerChoice, String result){
        System.out.println("You chose: " + userSelection);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
