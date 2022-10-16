package Chapter4;

import java.util.Arrays;

public class RandomeInput {

    public static void main(String[] args) {

        java.util.Random rand = new java.util.Random();

        double[] arrayVariable = new double[5];
//        arrayVariable[0] = 10;
//        arrayVariable[1] = 34;

        for(int i = 0; i < 5; i++){
            arrayVariable[i] = rand.nextDouble();
        }
        System.out.println(Arrays.toString(arrayVariable));
    }
}
