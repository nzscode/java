package Section4;

public class Tip4_2 {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
    
        //Task 2: Call a function that tips the waiter.
        tipTheWaiter(bill);


        double area1 = calculateArea(2, 5);
        System.out.println(area1);
    }



    
    //Task 1: Make a function here. See the doc comment for details.  

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */
    public static void tipTheWaiter(double bill){
        double tip = (bill*15)/100;
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
    }



        public static double calculateArea(double width, double length){
            return width *length;
        }

}

