package JavaBasic;

import java.util.Scanner;

public class Zugangskontrolle
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie alt bist du?: ");
        int alter = scanner.nextInt();
        //Sinvoller hier schon abzubrechen.
        System.out.println("Bist du Mitglied? (true/false)");
        boolean istMitglied = scanner.nextBoolean();

        if (istMitglied && alter >= 18)
        {
            System.out.println("Zugang gewährt.");
        }else {
            System.out.println("Zugang nicht erlaubt!.");
        }
        scanner.close();

    }
}
