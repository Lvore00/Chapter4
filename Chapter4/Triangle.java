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

public class Triangle {

    private double s1;
    private double s2;
    private double s3;


    public Triangle(double s1, double s2, double s3) throws IllegalTriangleSideException {
        checkSides(s1, s2, s3);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }


    public Triangle() throws IllegalTriangleSideException {
        this(1.0, 1.0, 1.0);
    }

    public boolean checkSides(double s1, double s2, double s3) throws IllegalTriangleSideException {
        if (s2 + s3 <= s1) {
            throw new IllegalTriangleSideException("s1 is invalid");
        }
        if (s1 + s3 <= s2) {
            throw new IllegalTriangleSideException("s2 is invalid");
        }
        if (s1 + s2 <= s3) {
            throw new IllegalTriangleSideException("s3 is invalid");
        }
        return true;
    }
}
