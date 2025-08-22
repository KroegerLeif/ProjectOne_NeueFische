package JavaBasic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus
{
    public static void main(String[] args) {
        //Aufgabe 1
        int [] numbers = {1, 2, 3, 4, 5};
        //Ausgabe
//        for (int number : numbers){
//            System.out.println(number);
//        }
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
        }
        //Ausgabe
//        for (int number : numbers){
//            System.out.println(number);
//        }

        //Aufgabe 2
        String[] vorname = {"Thomas","Paul","Hans","Sebastian","Johan","Rene"};
        String[] nachname = {"Müller","Mayer","Zimmermann","Schonlau","Tah","Adler"};
        //Only if both have the same length
        if(vorname.length == nachname.length){
            String[] fullName = new String[vorname.length];

            for(int i = 0; i < vorname.length; i++){
                fullName[i] = vorname[i] + " " + nachname[i];
            }

            for(String name : fullName){
                System.out.println(name);
            }
        }

        //Aufgabe 3
        Scanner scanner = new Scanner(System.in);
        int amountNumbers = 5;
        int[] userNummbers = new int[amountNumbers];
        System.out.println("Ich frage nun nach " + amountNumbers +" Zahlen.");

        //Abfrage
        for (int i = 0; i < amountNumbers; i++){
            System.out.println("Gib mir eine Zahl: ");
            userNummbers[i] = scanner.nextInt();
        }

        System.out.println("Deine Zahlen sind:");
        for (int number : userNummbers){
            System.out.println(number);
        }
        scanner.close();

        //Aufgabe 4
        int[] grades = { 85, 70, 95, 60};
        int summe = 0;
        for(int grade : grades){
            summe += grade;
        }
        int gradeAvrage = summe / grades.length;

        if(gradeAvrage >= 70){
            System.out.println("Der Durchscnitt ist bestanden! Glückwunsch!");
        }else {
            System.out.println("Der Durchscnitt ist nicht bestanden. Bitte versuchen Sie es erneut.");
        }

        //Aufgabe 5
        int[] randomNumbers = {1, 12, 35, 34, 5, 6, 27, 9, 9, 10};
        //Unsorted Array
        for (int number : randomNumbers){
            System.out.println(number);
        }
        Arrays.sort(randomNumbers);
        System.out.println("Sorted Array:");
        //Sorted Array
        for (int number : randomNumbers){
            System.out.println(number);
        }

        int min = randomNumbers[0];
        int max = randomNumbers[randomNumbers.length - 1];
        //Calculate the average
        int avverage = 0;
        for (int number : randomNumbers){
            avverage += number;
        }
        avverage /= randomNumbers.length;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avverage);

    }

}
