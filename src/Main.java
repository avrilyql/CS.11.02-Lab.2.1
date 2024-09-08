/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Avril Lim
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int addTwo = add(1,2);
        System.out.println(addTwo);
        int addFour = add(1,2,3,4);
        System.out.println(addFour);
        String greetMeMorning = morningGreeting("Avril");
        System.out.println(greetMeMorning);
        String greetMeAfternoon = afternoonGreeting("Avril Lim");
        System.out.println(greetMeAfternoon);
        String helloThrice = triple("hello");
        System.out.println(helloThrice);
        double halveThree = half(3);
        System.out.println(halveThree);
        int roundPos = roundPositiveValueToNearestInteger(6.76);
        System.out.println(roundPos);
        int roundNeg = roundNegativeValueToNearestInteger(-5.24);
        System.out.println(roundNeg);
    }

    // 1. add
    public static int add(int a,int b){
        return a+b;
    }
    // 2. add
   public static int add(int a, int b, int c, int d){
        return add(add(add(a,b),c),d);
   }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String triple){
        return triple + triple + triple;
    }
    // 6. half
    public static double half(int a){
        return a/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        if (a - (int)a < 0.5) {
            return (int)a;
        } else {
            return (int)a + 1;
        }
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        if (a - (int)a < -0.5) {
            return (int)a - 1;
        } else {
            return (int)a;
        }
    }
}
