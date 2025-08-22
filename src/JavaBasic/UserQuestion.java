package JavaBasic;

import java.util.Scanner;

public class UserQuestion {
    public static void main(String[] args) {
        //Source :https://www.w3schools.com/java/java_user_input.asp
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?: ");

        String userName = myObj.nextLine();

        System.out.println("What is your age?: ");

        String userage = myObj.nextLine();

        String line = "|";

        String header = String.format("%-10s %-2s %-5s", "Name",line, "Age");

        System.out.println(header);
        System.out.println("---------------------");

        String body = String.format("%-10s %-2s %-5s", userName,line, userage);

        System.out.println(body);

        myObj.close();
    }
}
