package JavaBasic.array;

public class Medium {
    public static void main(String[] args) {
        //Aufgabe 1
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //For Schleife
        for (int i = 0; i < numbers.length; i++){
            checkEven(numbers[i]);
        }

        //For Each Schleife
        for (int number : numbers){
            checkEven(number);
        }

        //Aufgabe 2
        int[] randomNumbers = {1, 12, 3, 34, 5, 6, 27, 8, 9, 10};
        int summe = 0;
        for(int number : randomNumbers){
            summe += number;
        }
        System.out.println(summe);

        //Aufgabe 3
        String[] cityNames = {"Hamburg","Berlin","Bremen","Münster","Köln","Stuttgart","Kiel"};
        for(int i = 0 ; i < cityNames.length ; i++){
            System.out.println("Am Index: " + i + " ist folgende Stadt: " + cityNames[i]);
        }

        //Aufgabe 4
        int[] numbers2 = {13, 2, 31, 4, 35, 26, 7, 8, 9, 10};
        int min = numbers2[0];
        int max = numbers2[0];

        for (int number : numbers2){
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }
    private static void checkEven(int number){
        if (number % 2 == 0){
            System.out.println(number);
        }
    }

}
