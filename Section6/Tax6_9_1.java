package Section6;

import java.util.Arrays;

public class Tax6_9_1 {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        for (int i = 0; i < price.length; i++) {
            double priceWithTax = price[i] + (price[i]*0.13);
            afterTax[i] = priceWithTax;
        }

        // See instructions on Learn the Part (Workbook 6.9)
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
