package com.ah;

import java.util.Scanner;

public class Main {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter input number : ");
            int inputNumber = input.nextInt();
            for (int number = 1; number <= inputNumber; number++) {

                if (number % 15 == 0) {
                    // If number is divisible by 15 ( 5 * 3)
                    System.out.printf("\n %s ", FIZZ_BUZZ);
                } else if (number % 3 == 0) {
                    // If number is divisible by 3
                    System.out.printf("\n %s ", FIZZ);
                } else if (number % 5 == 0) {
                    // If number is divisible by 5
                    System.out.printf("\n %s ", BUZZ);
                } else {
                    System.out.printf("\n %d ", number) ;
                }
            }
        }
    }
}