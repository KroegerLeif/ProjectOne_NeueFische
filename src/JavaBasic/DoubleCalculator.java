package JavaBasic;

import java.util.Scanner;

public class DoubleCalculator
{
    public static void main(String[] args) {
        double a = 4.6;
        double b = 1.2;

        boolean graterTen = (a + b) > 10;
        System.out.println(graterTen);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir einen buchstabe?");
        char buchstabe = scanner.nextLine().toLowerCase().charAt(0);

        switch (buchstabe)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vokal");
                break;
            default:
                System.out.println("Kein Vokal");
                break;
        }
    }
}
