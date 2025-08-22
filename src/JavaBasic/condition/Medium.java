package JavaBasic.condition;

public class Medium
{
    public static void main(String[] args) {
        //Aufgabe 1
        int score = 44;
        boolean hasTicket = true;

        if(score >= 50 && hasTicket)
        {
            System.out.println("Einlass gewährt.");
        }else
        {
            System.out.println("Einlass nicht gewährt.");
        }

        //Aufgabe 2
        int tempreture = 20;

        if(tempreture > 30) {
            System.out.println("Heiß");
        }else if(tempreture > 20) {
            System.out.println("Warm");
        } else if (tempreture > 10) {
            System.out.println("Kühl");
        }else {
            System.out.println("Kalt");
        }

        //Aufgabe 3
        int number = 17;
        String parity = (number % 2 == 0)? "Grade":"Ungrade";
        System.out.println(parity);
    }
}
