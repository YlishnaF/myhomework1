
public class Main {

    public static void main(String[] args) {
        byte num1 = 2;
        short num2 =-45;
        int num3 = 456;
        long num4 = 34546L;
        float num5 = 0.4f;
        double num6 = 4.56;
        char star = '*';
        String myGoal = "Я владею языком Java в совершенстве!";

        calculate(2f,4.4f,5f,4.3f);
        isTheNumberInRange(4,8);
        plusOrMinus(-7);
        findNegative(-4);
        helloMan("Vasya");
        leapYear(2000);
    }

    public static float calculate(float a, float b, float c, float d){
        return  a * (b + (c / d));
    }

    public static boolean isTheNumberInRange(int a, int b){
        if((a+b)>=10 || (a+b)<=20 ){
            return true;
        } else{
            return false;
        }
    }

    public static void plusOrMinus(int a){
        if(a>=0) {
            System.out.println("Число поожительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean findNegative(int a) {
        if (a < 0) {
            return true;
        } else{
            return false;
        }
    }
    public static void helloMan(String s){
        System.out.println("Привет, " + s);
    }

    public static void leapYear(int year){
        if(year %4 !=0 || year % 400 !=0){
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный!");
        }
    }
}
