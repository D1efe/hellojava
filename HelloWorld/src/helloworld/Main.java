package helloworld;

import java.util.Random;
import java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        //Task 1 - HELLO WORLD! 
        System.out.println("Hello World");

        //Task 2 - ASSIGNMENT
        String message = "Hello World!";
        System.out.println(message);

        //Task 3 - PARAMETERS
        printMessage(message);

        //Task 4 - RETURN TYPES
        System.out.println(printHelloWorld());

        //Task 5, 6 - PARAMETERS/OPERATORS, CONDITIONALS        
        System.out.println(sumNumbers(2, 3, true));
        System.out.println(sumNumbers(3, 3, false));

        //Task 8 - ITERATION
        for (int c = 0; c < 10; c++) {
            System.out.println(sumNumbers(3, 3, true) + ": index is equal to " + c);

        }
        //Task 9 - ARRAYS
        int[] numberArray = new int[]{3, 7, 13, 9, 22, 9, 35, 19, 27, 49};
        for (int i = 0; i < numberArray.length; i++) {
            Random rng = new Random();
            int number = rng.nextInt(10);
            System.out.println("array index " + i + ": " + sumNumbers(numberArray[number], numberArray[number], true));
            

        }
        //Task 10 - ITERATION/ARRAYS
        for (int count = 0; count < numberArray.length; count++) {
            System.out.println("index " + count + ": " + numberArray[count]);
        }

        //Task 11 - ITERATION/ARRAYS 2
        int[] moreNumbers = new int[5];

        for (int index = 1; index < moreNumbers.length; index++) {
            moreNumbers[index] = index;
            System.out.println("position " + index + " = " + moreNumbers[index]);

        }
        for (int x : moreNumbers) {
            System.out.println("index multipled by 10: " + x * 10);
        }
        
              
        //Used with intermediate tasks
        IntermediateExercise oob = new IntermediateExercise();
        
        //Task 12 - BLACKJACK
        oob.blackJack();
        
        //Task 13 - TOO HOT?
        System.out.println(oob.tooHot(100, true));

    }

    //Task 3 method - PARAMETERS
    private static void printMessage(String methodMessage) {
        System.out.println(methodMessage);

    }

    //Task 4 method - RETURN TYPES
    private static String printHelloWorld() {
        return "Hello World!";

    }
    //task 5, 6, 7 method - PARAMETERS/OPERATORS, CONDITIONALS, CONDITIONALS 2

    private static int sumNumbers(int a, int b, boolean anyValue) {
        int total;

        if (anyValue == true) {
            total = a + b;
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            total = a * b;

        }
        return total;
    }

}
