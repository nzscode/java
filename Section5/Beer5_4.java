package Section5;

public class Beer5_4 {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
        sing(99);
    }
    public static void sing(int i){
        for (int j = i; j >= 1 ; j--) {
            System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer! \ntake one down, pass it around " + (j -1) + ", bottles of beer on the wall!");
        }
    }

}
