package Section4;

public class Weather4_3 {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

//        double celsius = fahrenheitToCelsius(77);
//        printTemparatures(celsius, 77);
//        double celsius2 = fahrenheitToCelsius(61);
//        printTemparatures(celsius2, 61);
//        double celsius3 = fahrenheitToCelsius(55);
//        printTemparatures(celsius2, 55);

        fahrenheitToCelsius(77);
        fahrenheitToCelsius(61);
        fahrenheitToCelsius(55);

        //Task 3 - Call the printTemperatures function. 
        
        
    }


    //Task 1: Make a function here. See the doc comments below.
    public static void fahrenheitToCelsius(double fahrenheit){
        double celsius =  (fahrenheit - 32) * 5 / 9;
        printTemparatures(celsius, fahrenheit);
    }

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */

     
    //Task 2: Make a function here. See the doc comments below. 
    public static void printTemparatures(double celsius, double fahrenheit){
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + celsius);
    }
    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
}