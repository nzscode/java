package Section6;

import java.util.Arrays;

public class ReferanceTrap6_10_0 {
    public static void main(String[] args) {
        String[] names = {"Anna", "Tom", "Silas"};
        System.out.println(Arrays.toString(names));

        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(nums));

        double[] decimals = {1.25, 3.99, 0.56};
        System.out.println(Arrays.toString(decimals));

        Boolean[] bools = {true, false, true, true};
        System.out.println(Arrays.toString(bools));
    }
}
