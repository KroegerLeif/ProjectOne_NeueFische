package JavaBasic.condition;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Wie ist dein Name?");
        String name = scanner.nextLine();

        if(name == null || onlySpaces(name))
        {
            System.out.println("Ungültiger Benutzer.");
            return;
        }
        System.out.println("Halllo " + name );

        double epsilon = 0.000001;
        double x = 0.1 + 0.2;

        if(Math.abs(x - 0.3) < epsilon)
        {
            System.out.println("Fast 0,3");
        }else {
            System.out.println("Nicht gleich 0,3");
        }

        System.out.println("Bitte user Name eingeben: ");
        String userName = scanner.nextLine();
        if(userName == null || userName.isEmpty())
        {
            scanner.close();
            return;
        }
        System.out.println("Bitte gib dein Alter ein: ");
        int userAge = scanner.nextInt();
        scanner.close();
        if (userAge < 18)
        {
            return;
        }
        System.out.println("Registrierung erfolgreich");



    }
    public static boolean onlySpaces(String text)
    {
        int countSpaces =0;
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == ' ')
            {
                countSpaces++;
            }
        }
        return countSpaces == text.length();
    }


}
