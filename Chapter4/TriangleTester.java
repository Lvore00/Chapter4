package Chapter4;


public class TriangleTester {
    public static void main(String[] args) throws IllegalTriangleSideException {

        try {
            System.out.println();
            System.out.println("Testing Triangle()");
            Triangle triangle = new Triangle();
            System.out.println("Triangle() is valid");
        } catch (IllegalTriangleSideException itse) {
            System.out.println(itse.getMessage());
        }

        try {
            System.out.println();
            System.out.println("Testing Triangle (4.1, 3.6, 7.9)");
            Triangle triangle = new Triangle(4.1, 3.6, 7.9);
            System.out.println("Triangle (4.1, 3.6, 7.9) is valid");
        } catch (IllegalTriangleSideException itse) {
            System.out.println(itse.getMessage());
        }

        try {
            System.out.println();
            System.out.println("Testing Triangle (2.3, 9.0, 5.5)");
            Triangle triangle = new Triangle(2.3, 9.0, 5.5);
            System.out.println("Triangle (2.3, 9.0, 5.5) is valid");
        } catch (IllegalTriangleSideException itse) {
            System.out.println(itse.getMessage());
        }

        try {
            System.out.println();
            System.out.println("Testing Triangle (1.3, 4.5, 4.5)");
            Triangle triangle = new Triangle(1.3, 4.5, 4.5);
            System.out.println("Triangle (1.3, 4.5, 4.5) is valid");
        } catch (IllegalTriangleSideException itse) {
            System.out.println(itse.getMessage());
        }
    }

}
