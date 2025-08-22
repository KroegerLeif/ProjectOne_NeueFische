package JavaBasic.methoden;

public class Bonus {
    public static void main(String[] args) {
        //Aufgabe 1
        System.out.println(isEven(11));

        //Aufgabe 2
        printSumMessage(add(10, 20));
    }
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static void printSumMessage(int summ){
        System.out.println("Die Summe ist: " + summ);
    }
}
