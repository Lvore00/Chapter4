package Chapter4;

/*Name: Lillian Vore
Class: ITEC 2150
Date: 10/12/2022
Directions: Create a simple addition calculator in Java. The program should prompt the user to enter 2 integers,
        then adds the numbers and prints the result.
        Make sure the program includes appropriate exception handling in case
        the user does not enter appropriate integer values.*/


import java.util.InputMismatchException;

public class Exercise1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueLoop = true; // loop

        do {

            try {
                System.out.println("Enter an integer to add: ");
                int first = input.nextInt();

                System.out.println("Enter another integer to add to the first: ");
                int second = input.nextInt();

                int addition = first + second;

                continueLoop = false;

                System.out.println(first + "+ " + second + " = " + addition);
            } catch (InputMismatchException e) {

                input.nextLine();
                System.out.println(e + ". Try it again. ");
            } catch (ArithmeticException e) {
                input.nextLine();
                System.out.println(e + " Try it again. ");
            }
        }while(continueLoop);

    }
}
