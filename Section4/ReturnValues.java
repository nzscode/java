package Section4;

import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area1 = calculateArea(2.3, 3.6);
        System.out.println("the area is " + area1);
        double area2 = calculateArea(1.6, 2.4);
        System.out.println("the area is " + area2);
        double area3 = calculateArea(2.6, 4.2);
        System.out.println("the area is " + area3);
        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String SpanishExplanation = explainArea("Spanish");


    }
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;

    }

    public static String explainArea(String language){
        switch(language){
            case "English": return ("Area equals length * width");
            case "French": return ("La surface est egale a la longueur * la largeur");
            case "Spanish": return ("area es igual a largo * ancho");
            default: return ("Please make a valid choice.");
        }
    }
}
//English "Area equals length * width"
//
//French "La surface est egale a la longueur * la largeur"
//
//Spanish "area es igual a largo * ancho"
