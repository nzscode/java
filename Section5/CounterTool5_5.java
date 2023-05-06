package Section5;

import java.util.Scanner;

public class CounterTool5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        System.out.print("1. Pick a number to count by: ");
        int countBy = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int startFrom = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int countTo = scan.nextInt();
        counter(countBy, startFrom, countTo);
       // See detailed instructions on Learn the Part.

        scan.close();
    }
    public static void counter(int countBy, int startFrom, int countTo){
        for (int i = startFrom; i <= countTo; i += countBy) {
            System.out.print(i + " ");
        }
    }
}
