package JavaBasic.methoden;

public class Easy {
    public static void main(String[] args) {
        //Aufgabe 1
        printHello();

        //Aufgabe 2
        System.out.println(getGreeting());

        //Aufgabe 3
        printName("Leif");
    }

    public static void printHello()
    {
        System.out.println("Hello World");
    }

    public static String getGreeting(){
        return "Willkommen im Java-Kurs";
    }

    public static void printName(String name){
        System.out.println("Hallo " + name);
    }
}
