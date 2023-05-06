package Section3;

public class IfElse3_2 {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (chemistryGrade > biologyGrade){
            System.out.println("Yes, your bilology grade was better.");
        }else{
            System.out.println("No, your chemistry grade was higher.");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if (sales > costs){
            System.out.println("Yes, we made $" + (sales + costs) +".");
        }else{
            System.out.println("No, our costs were too high.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if (temperature < targetTemperature){
            System.out.println("Yes, brrrr! It is colder.");
        }else{
            System.out.println("Nope, still too toasty.");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if (currentSpeed < speedLimit){
            System.out.println("Yes, you are driving cautiously");
        }else{
            System.out.println("NO! Slow down there bucko!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if (age >= retirementAge){
            System.out.println("Yes, retirement, here we come.");
        }else{
            System.out.println("Nope "+ (retirementAge - age)+ " more years of the grind.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if (myGrade == bestGrade){
            System.out.println("Good job!");
        }else{
            System.out.println("Better luck next time.");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if (word.equals(secondWord)){
            System.out.println("Yup, same words.");
        }else{
            System.out.println("Uh, no. Those are obviously not the same words.");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if (!thirdWord.equals(fourthWord)){
            System.out.println("You can read right? Those are clearly different words.");
        }else{
            System.out.println("You need to look again, they are the same word.");
        }
    }
}
