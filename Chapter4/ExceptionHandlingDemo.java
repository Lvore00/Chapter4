package Chapter4;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer");
                int number = input.nextInt();
                continueInput = false;
                System.out.println("You entered " + number);
            } catch (Exception e) {
                System.out.println(e + ". Try it again. Enter an integer");
                input.nextLine(); //this method will take care of incorrect
                // input
            }
        }while(continueInput);
    }
}
