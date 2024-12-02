package Basics;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
    }
}
