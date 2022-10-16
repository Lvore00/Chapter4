package Chapter4;


/*Name: Lillian Vore
Date: 10/12/2022
Class: ITEC 2150
Directions: Write a Java program to randomly creates an array of 50 double values.
        Prompt the user to enter an index and prints the corresponding array value.
        Include exception handling that prevents the program from terminating if an out of
        range index is entered by the user. (HINT: The exception thrown will be ArrayIndexOutOfBounds)*/

import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {

            double[] list = new double[50];
            Random random = new Random();
            java.util.Scanner input = new java.util.Scanner(System.in);
            double indexNumber = 0;

            System.out.println("The last number in the array:  ");
            try {
                indexNumber = input.nextInt();
                if(indexNumber != list.length - 1){
                    throw new ArrayIndexOutOfBoundsException("You did not write the " +
                            "correct index value. ");
                }
            }catch(IllegalArgumentException e){
                System.out.println(e);
                do{
                    indexNumber = input.nextInt();
                }while(indexNumber != list.length - 1);
            }

            System.out.println(indexNumber  + " is " + list[indexNumber] );
        }

    }

