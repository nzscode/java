public class TestingGround{
    public static void main (String[] args){
        int num1 = 10;
        if (num1 >= 12){
            System.out.println("num1 is larger than or equal to 10");
        }else{
            System.out.println("num1 is smaller than 10");
        }


        int num2 = 10;
        String result = (num1 >= 8)? "num1 is larger than or equal to 10" :
                "num1 is smaller than 10";
        System.out.println(result);
    }
}