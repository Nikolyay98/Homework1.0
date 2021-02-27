public class Main {
    public static void main(String[] args){
    System.out.println(mathExpression(4, 20, 95,15));
    System.out.println(ifNumberBetween10and20(10, 10));
        positivOrNegative(0);
        positivOrNegative(-1);
     System.out.println(helloName("Николай"));
   System.out.println(ifLeapYear(2018));
        System.out.println(ifLeapYear(2016));
        System.out.println(ifLeapYear(2000));
        System.out.println(ifLeapYear(1900));
    }
    public static float mathExpression(int a, int b, int c, int d){
        float result = (a * (b + ((float)c / d)));
        return result;
    }
    public static boolean ifNumberBetween10and20(int a, int b){
        boolean result = true;
        int c = a+b;
        if(c > 10 && c <= 20){
            return true;
        }
        else{
            return false;
        }
    }
    public static void positivOrNegative(int a){
        if(a >= 0){
            System.out.println(a + " is positive");
        }
        else{
            System.out.println( a + " is negative");
        }
    }
    public static String helloName(String name){
        String helloMessage = "Привет "+ name + "!";
        return helloMessage;
    }
    public static boolean ifLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
