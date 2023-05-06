package Section4;
import java.util.*;

public class Parameters4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calculateArea(2.3, 3.5);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.3);


    }
    public static void calculateArea(double length, double width){
        double area = length * width;
        System.out.println("the area is " + area);
    }

}
