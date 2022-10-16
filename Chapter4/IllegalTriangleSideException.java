package Chapter4;


public class IllegalTriangleSideException extends Exception{
    public IllegalTriangleSideException(){
        super ("Illegal Triangle Side Exception occurred");
    }

    public IllegalTriangleSideException(String msg){
        super(msg);
    }
}
