package JavaBasic.methoden;

public class Medium {
    public static void main(String[] args) {
        //Aufgabe 1
        int result = add(10, 20);
        System.out.println(result);

        //Aufgabe 2
        double area = calculateArea(10, 20);
        System.out.println(area);

        //Aufgabe 3
        checkPositive(-11);
    }
    public static int add(int a, int b){
        return a +b;
    }

    public static double calculateArea(double width, double height){
        return width * height;
    }

    public static void checkPositive (int number){
        if (number < 0){
            System.out.println("Die Zahl ist negativ");
            return;
        }
        System.out.println("Die Zahl ist positiv");
    }
}
