package JavaBasic.operatoren;

import java.util.Scanner;

public class UserQuestionTwo
{
    public static void main(String[] args) {
        //Hier lieber var?
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?: ");
        var userName = myObj.nextLine();
        System.out.println("What is your age?: ");
        int userage = Integer.parseInt(myObj.nextLine());
        System.out.println("What is your favorite character?");
        char userCharacter = myObj.nextLine().charAt(0);

        System.out.println("Hey "+ userName +" you are " + userage + " years old and your favorite character is " + userCharacter);
        myObj.close();
    }
}
