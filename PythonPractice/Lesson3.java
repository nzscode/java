package PythonPractice;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Booleans & Conditionals: Lesson 3.7");
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
//        String decision = scan.nextLine();
        String decision = "yes";
        //Task 1 - Pick up the user's decision.
        switch(decision){
            case "yes": System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
//                double savings = scan.nextDouble();
                double savings = 15000;
//                double debt = scan.nextDouble();
                double debt = 5000;
                System.out.println("\nHow many years have you worked for?");
//                int years = scan.nextInt();
                int years = 5;
                System.out.println("What is your name?");
//                scan.nextLine();
//                String name = scan.nextLine();
                String name = "Noor";
                if (savings >= 10000 && debt < 5000 && years > 2){
                    System.out.println("Congratulations " + name + " You have been approved!");break;
                }else{
                    System.out.println("Sorry, you are not eligible for a mortgage.");break;
                }
            default: System.out.println("\nOK. Have a nice day!");
        }

        System.out.println("Booleans & Conditionals: Challenge");
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        //store answer 1
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        //store answer 2
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        //store answer 3
        String answer3 = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        //store answer 4
        String answer4 = scan.nextLine();
        int score = 0;


        //Task 2: Check each answer - For each correct answer, add 5 points to the score.
        switch(answer1){
            case ("c"): score += 5;
                break;
            default: ;
        }
        switch(answer2){
            case ("a"): score += 5;
                break;
            default: ;
        }
        switch(answer3){
            case ("d"): score += 5;
                break;
            default: ;
        }
        switch(answer4){
            case ("a"): score += 5;
                break;
            case ("b"): score += 5;
                break;
            default: ;
        }


        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        }else if (score < 15 && score > 5 ) {
            System.out.println("Not bad!");
        }else{
            System.out.println("better luck next time.");
        }
        System.out.println("Your final score is: " + score + "/20");
        scan.close();
    }
}
