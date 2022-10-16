package Chapter4;


/*Name: Lillian Vore
Date: 10/12/2022
Class: ITEC 2150
Directions: Create a custom Exception named IllegalTriangleSideException.
        Create a class named Triangle. The Triangle class should contain 3 double variables containing
        the length of each of the triangles three sides. Create a constructor with three parameters to initialize
        the three sides of the triangle. Add an additional method named checkSides with method header
        - *boolean checkSides() throws IllegalTriangleSideException *. Write code so that checkSides makes sure that
        the three sides of the triangle meet the proper criteria for a triangle. It will return true if and only if the
        sum of side1+ side2 is greater than side3 AND the sum side2+side3 is greater than side1
        AND the sum of side1+ side3 is greater than side2. If any of those three conditions is not met,
        the method will create and throw an IllegalTriangleSideException.
        Add a main method to create and check two to three different triangles.*/

import ExceptionDemo.Circle.InvalidRadiusException;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;
    public static double totalNumber = 0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() throws IllegalTriangleSideException{
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleSideException{
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        totalNumber++;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalTriangleSideException {
       if (side1 > side2+side3)
        throw new IllegalTriangleSideException(side1);

       else
           this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleSideException {
        if (side2 > side1+side3)
            throw new IllegalTriangleSideException(side2);

        else
            this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleSideException{
        if (side3 > side2+side1)
            throw new IllegalTriangleSideException(side3);

        else
            this.side3 = side3;
    }

    public static double getTotalNumber(){
        return totalNumber;
    }




}
