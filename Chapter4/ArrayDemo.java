package Chapter4;

public class ArrayDemo {
    public static void main(String[] args) {

        //Arrays of int value

        int[] lilly = {1,13,5,7, 12};  //to identify the last index of any
        // array is  arrayVariableName[arrayVariableName.length - 1]  ...
        // this is how to identify the last value of the array by usin g the
        // last index number of that array. lilly[lilly.length - 1]

        int length = lilly.length;

        System.out.println("Length of lilly array is " + length);

        String[] lillyString = {"Lilly","Vore","Student","ITEC 2150"};
        //lillyString[lillyString.length - 1]
        int lengthString = lillyString.length;
        System.out.println("Length of Lilly String array is " + lengthString);

        double[] lillyDouble = {5.6, 7.8, 9.0, 10.2, 5.6, 78.2, 77.8};
        //lillyDouble[lillyDouble.length - 1]
        int lengthDouble = lillyDouble.length;
        System.out.println("Length of double arrays is " + lengthDouble);

        char[] ch = {'a','b','c','9','8'}; //ch[ch.length - 1]
        int lengthChar = ch.length;
        System.out.println("Length of char is " + lengthChar);


        boolean[] bl = {true, false, true, false, true, true};
        int booleanLength = bl.length;
        System.out.println("Boolean type array length is " + booleanLength);

        //what is the type of an index value? ex. 0, 1, 2, 3, 4, 5... :
        // integer.
    }
}
