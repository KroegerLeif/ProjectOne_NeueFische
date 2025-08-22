package JavaBasic.methoden;

public class MiniTaschenrechner {
    public static void main(String[] args) {
        System.out.println(add(12,34));
        System.out.println(subtract(12,34));
        System.out.println(multiply(12,34));
        System.out.println(divide(12.3,34.6));

        System.out.println(add(23,12));
        System.out.println(subtract(3,78));
        System.out.println(multiply(12,45));
        System.out.println(divide(19.3,0));

        System.out.println(add(-12,34));
        System.out.println(subtract(92,30));
        System.out.println(multiply(12,10));
        System.out.println(divide(24.0,2.6));

    }

    public static int add(int summand, int summand2){
        return summand + summand2;
    }
    public static int subtract(int minunand, int subtrahend){
        return minunand - subtrahend;
    }
    public static int multiply(int faktor, int faktor2){
        return faktor * faktor2;
    }
    public static double divide(double dividend, double divisor){
        if(divisor == 0){
            System.out.println("Division durch null nicht mölgich");
            return 0;
        }
        return dividend / divisor;
    }

}





