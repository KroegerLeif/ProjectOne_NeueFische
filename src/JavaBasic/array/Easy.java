package JavaBasic.array;

public class Easy {
    public static void main(String[] args) {
        //Aufgabe 1
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Aufgabe 2
        String[] names = {"Paul", "Hans", "Peter","Johan","Tina"};
        for(String name : names){
            System.out.println(name);
        }

        //Aufgabe 3
        int[] notQuadaticNumbers = {2, 4, 6, 8};
        for(int i = 0; i < notQuadaticNumbers.length; i++){
            calculateQuadratZahl(notQuadaticNumbers[i]);
        }
    }
    private static void calculateQuadratZahl(int number){
        System.out.println(number * number);
    }
}
