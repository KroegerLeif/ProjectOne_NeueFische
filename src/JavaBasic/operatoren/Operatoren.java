package JavaBasic.operatoren;

public class Operatoren
{
    public static void main(String[] args) {
        int x = 5;
        int y = 51;

        int summe = x+y;

        System.out.println("Die Summe ist: " + summe);

        if(x == y)
        {
            System.out.println("Die Zahlen sind gleich");
        }else {
            System.out.println("Die Zahlen sind ungleich");
        }

        System.out.println(x >0 && x< 100);
        System.out.println(x >0 && x< 100);

        System.out.println(x % 5 == 0 && x % 2 == 0);

        int preisCent = 1000;
        boolean rabatt = true;

        if(rabatt)
        {
            preisCent *= 0.9;
        }

        System.out.println("Das Produkt kostet: " + preisCent + " Cent.");

        System.out.println(y % 2 == 0 || y > 50);
    }
}
