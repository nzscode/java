package PythonPractice;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Variables: Lesson 2.1");
        int points = 0;

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -= 3;
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;
        System.out.println("Points: " + points);

        System.out.println("Variables: Lesson 2.2");

        String name = "Noor";
        int age = 38;
        String country = "Canada";
        int hours = 5;
        String sport = "Reading";
        String game = "Stardew Valley";
        String subject = "Language";
        int grade = 98;

        System.out.println("My name is "+name+". I'm "+age+" years old, and I'm from "+country+".");
        System.out.println("My favourite sport is "+sport+". I play for "+hours+" hours a day");
        System.out.println("When I'm tired, I like to play "+game+".");
        System.out.println("In school, my favourite subject was "+subject+", I scored a "+grade+".");

        System.out.println("Variables: Lesson 2.3");

        int numOfApples = 0;
        int numOfCustomers = 0;
        double fruitProfit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        System.out.println("Time for business! You're selling each apple for 40 cents");
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers += 1;
        fruitProfit += (4*0.40);
        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers += 1;
        fruitProfit += (20*0.40);
        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers += 1;
        fruitProfit += (200*0.40);
        System.out.println("Wow! So far, you made: $"+fruitProfit+".");
        System.out.println(numOfCustomers+" customers love your apples.");
        System.out.println("You have "+numOfApples+" apples left. We'll sell more tomorrow.");

        System.out.println("Variables: Lesson 2.4");
        double sales = 24309.65;
        double profit = 18562.18;
        double refunds = 688.78;
        double shipping = 1233.57;

        System.out.println("This month, we made $"+((int)sales)+" in sales");
        System.out.println("Factoring in costs, we made $"+(int)profit+" in profit");
        System.out.println("The refunds are at a low $"+(int)refunds+". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $"+(int)shipping+" in shipping");

        System.out.println("Variables: Lesson 2.5");
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");


        System.out.println("What is your first name?");
//        String firstName = scan.nextLine();
        String firstName = "Noor";
        System.out.println("What is your last name?");
//        String lastName = scan.nextLine();
        String lastName = "Zaq";
        System.out.println("How old are you?");
//        int javagramAge = scan.nextInt();
        int javagramAge = 38;
        System.out.println("Make a username");
//        scan.nextLine();
//        String userName = scan.nextLine();
        String userName = "afadfsdfsd";
        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.

        System.out.println("What city do you live in?");
//        String city = scan.nextLine();
        String city = "Ajax";

        System.out.println("What country is that?");
//        String javagramCountry = scan.nextLine();
        String javagramCountry = "Canada";

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + javagramAge);
        System.out.println("\tUsername: " + userName);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + javagramCountry);
//        scan.close();

        System.out.println("Variables: Challenge");
        Scanner chatBotScan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String chatBotName = scan.nextLine();
        System.out.println("\nHi " + chatBotName + "! I'm Javabot. Where are you from?");
        String chatBotCity = scan.nextLine();
        System.out.println("\nI hear it's beautiful at " + chatBotCity + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int chatBotage = scan.nextInt();
        System.out.println("\nSo you're " + chatBotage + ", cool! I'm 400 years old.");
        System.out.println("This means I'm "+ (400/chatBotage) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String chtBotLanguage = scan.next();
        System.out.println("\n" + chtBotLanguage + ", that's great! Nice chatting with you " + chatBotName + ". I have to log off now. See ya!");
        scan.close();




    }
}
