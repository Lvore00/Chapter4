package Chapter4;


/*Name: Lillian Vore
Date: 10/12/2022
Class: ITEC 2150
Directions: Write a Java program to randomly creates an array of 50 double values.
        Prompt the user to enter an index and prints the corresponding array value.
        Include exception handling that prevents the program from terminating if an out of
        range index is entered by the user. (HINT: The exception thrown will be ArrayIndexOutOfBounds)*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        double[] list = new double[50];
        Random rand = new Random();


        int indexNumber = 0;
        for(int i = 0; i < 50; i++){
            list[i] = rand.nextDouble();
        }
        // System.out.println(Arrays.toString(list));


        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an index: ");
                int index = input.nextInt();
                System.out.println("list[" + index + "] = " + list[index]); 	// ArrayIndexOutOfBoundsException thrown here if index is not 0-49
                continueInput = false;											// only set false if no exception was thrown
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e + ". Try it again. Enter an integer");
                input.nextLine(); // advance the Scanner past the previous input
            }
        }while(continueInput);
    }
}



