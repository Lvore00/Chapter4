package Chapter4;


public class IllegalTriangleSideException extends Exception{
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleSideException(double side1, double side2, double side3){
        super ("Invalid triangle side exception");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public IllegalTriangleSideException(){
        super ("Invalid triangle side exception");
    }
}
