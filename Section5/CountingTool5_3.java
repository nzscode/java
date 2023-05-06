package Section5;

import java.util.Scanner;

public class CountingTool5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int num = scan.nextInt();

        for (int i = 0; i < (num + 1); i++) {
            System.out.print(i + " ");

        }

        // See Learn the Part for the instructions.

        scan.close();
    }
}
