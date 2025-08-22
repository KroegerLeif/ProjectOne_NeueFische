package JavaBasic;

import java.util.Scanner;

public class MiniProgramm
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein: ");
        int zahl = scanner.nextInt();
        System.out.println("Gebe eine weitere Zahl ein: ");
        int zahl2 = scanner.nextInt();
        System.out.println("Gebe eine Dezimalzahl ein:");
        double dezimalzahl = scanner.nextDouble();

        double ergebniss = zahl + zahl2 * dezimalzahl;
        System.out.println("Das Ergebnis ist: " + ergebniss);

        boolean positiveZahl = ergebniss >= 0;

        if(positiveZahl)
        {
            System.out.println("Positive Zahl");
        }else {
            System.out.println("Negative Zahl");
        }

        scanner.close();
    }


}
