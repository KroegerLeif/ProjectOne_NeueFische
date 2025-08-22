package JavaBasic.condition;

public class Easy
{
    public static void main(String[] args) {

        //Aufgabe 1
        int age = 19;

        if(age >= 18)
        {
            System.out.println("Volljährig");
        }

        //Aufgabe 2
        boolean isRaining = true;

        if(isRaining)
        {
            System.out.println("Nimm einen Regenschirm");
        }else
        {
            System.out.println("Kein Regenschirm nötig");
        }

        //Aufgabe 3
        String city = "Berlin";

        if (city.toLowerCase().equals("berlin"))
        {
            System.out.println("Hauptstadt");
        }
    }
}
