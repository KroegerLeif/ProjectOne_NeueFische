package JavaBasic.dataType;


public class DataTypes
{
    public static void main(String[] args) {
        int age = 24;
        System.out.println(age);

        double size = 1.80;
        System.out.println(size);

        char firstLetter = 'L';
        System.out.println(firstLetter);

        String name = "Leif";
        System.out.println(name);

        //Medium
        System.out.println("Mein Name ist " + name + " und ich bin " + age + " Jahre alt. Ich bin " + size + "m groß.");

        boolean isAdult = age >= 18;

        if (isAdult)
        {
            System.out.println("Du bist erwachsen.");
        }else {
            System.out.println("Du bist nicht erwachsen.");
        }

        int x = 5;
        int y = 10;

        int summe = x+y;
        int differenz = x-y;
        int produkt = x * y;
        double quotient = (double) x / y;

        System.out.println("Die Summe ist: " + summe);
        System.out.println("Die Differnezt ist: "+ differenz);
        System.out.println("Das Produkt ist: " + produkt);
        System.out.println("Das Quotient ist: " + quotient);

        String beispielSatz = "Ich kam ich sah ich siegte.";
        int lengthBeispielSatz = beispielSatz.length();
        char firstCharakter = beispielSatz.charAt(0);
        String upperCase = beispielSatz.toUpperCase();
    }
}
