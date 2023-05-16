package PythonPractice;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Functions: Lesson 4.2");
        double bill = 53.50;
        double tip = tipTheWaiter(bill);
        System.out.println("You service was wonderful! Please accept this tip: $" + tip  + ".");

        System.out.println("Functions: Lesson 4.5");
        double area = areaSquare(5);
        System.out.println(area);

        System.out.println("Functions: Challenge 1");
    }

    /**
     * Function Name: tipTheWaiter
     * @param bill (double)
     * @return (double)
     *
     * Inside Function:
     * 1. Multiplies bill by 0.15 for 15% tax.
     */
    public static double tipTheWaiter(double bill){
        return bill*0.15;

    }

    /**
     * Function Name: areaSquare
     * @param side(double)
     * @return (double) side * side
     *
     * Inside Function:
     * 1. Takes side and multiplies it by itself.
     */
    public static double areaSquare(double side){
        return side*side;
    }
}
