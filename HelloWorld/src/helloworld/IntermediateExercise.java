package helloworld;

import java.util.Random;
import java.util.Scanner;

public class IntermediateExercise {

    private Scanner userInput = new Scanner(System.in);

    //Task 12 - BLACKJACK (using random number generation)
    public void blackJack() {
        Random rand1 = new Random();
        Random rand2 = new Random();

        int card1 = rand1.nextInt(30);
        int card2 = rand2.nextInt(30);
        int result;

        System.out.println("your numbers are: " + card1 + " & " + card2);

        if (card1 > 21 && card2 > 21) {
            result = 0;
            System.out.println(result);
        } else if (card1 <= 21 & card2 <= 21) {
            result = Math.max(card1, card2);
            System.out.println(result);
        }
    }

    //Task 13 - UNIQUE
    public void unique(int a, int b, int c) {

        int total;
        total = a + b + c;

        if (a == b && a != c) {
            total = c;
        } else if (b == c && b != a) {
            total = a;

        } else if (c == a && c != b) {
            total = b;
        } else if (a == b && b == c && c == a) {
            total = 0;
        }

        System.out.println(total);

    }

    //Task 14 - TOO HOT
    public boolean tooHot(int a, boolean isSummer) {
        int temperature = a;

        if (isSummer == true) {
            if (temperature > 60 && temperature < 100) {
                return true;
            } else {
                return false;
            }
        } else if (temperature > 60 && temperature < 90) {
            return true;
        } else {
            return false;
        }

    }
}
