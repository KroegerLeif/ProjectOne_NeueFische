package JavaBasic;

import java.util.Scanner;

public class Bonus
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Fragt den Benutzer nach einer Zahl
        System.out.println("Gebe eine Zahl ein: ");
        int zahl = scanner.nextInt();

        if(zahl >= 10 && zahl <= 20)
        {
            System.out.println("Treffer");
        }else {
            System.out.println("Kein Treffer");
        }

        int a = 4;
        int b =6;
        int c = 2;

        //Prüfe in einem einzigen if, ob a größer als b und b kleiner oder gleich c ist oder c negativ ist.
        if((a >b && a<= c )|| c < 0)
        {
            System.out.println("Überprüfung erfolgreich");
        }else
        {
            System.out.println("Fall ist nicht eingetreten.");
        }

        scanner.close();
    }


}
