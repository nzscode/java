package Section5;

import java.util.Scanner;

public class Detention5_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        String line = scan.nextLine();

        for (int i = 100; i >= 2; i--) {
            System.out.println((i-1) + ". " + line);
        }

        
    }
}
