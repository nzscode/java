package Section2;

public class Debugging {

    public static void main(String[] args) {

        double exam1Score = 85;
        int exam2Score = 90;
        int exam3Score = 95;

        int total = 100;

        double decimalScore1 = exam1Score / total; 
        double decimalScore2 = (double)exam2Score / total;
        double decimalScore3 = (double)exam3Score / total;

        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;

        System.out.println("The decimal average is: " + decimalAverage);

    }
}
