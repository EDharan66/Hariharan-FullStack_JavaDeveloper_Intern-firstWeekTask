
class ArithmaticThrowableClass{

    public void division(int num1, int num2){
        try{
            //java.lang.ArithmeticException here.
            System.out.println(num1/num2);
            //catch ArithmeticException here.
        }catch(ArithmeticException e){
            //print the message string about the exception.
            System.out.println("getMessage(): " + e.getMessage());
            //print the cause of the exception.
            System.out.println("getCause(): " + e.getCause());
            //print class name + “: “ + message.
            System.out.println("toString(): " + e.toString());
            System.out.println("printStackTrace(): ");
            //prints the short description of the exception
            //+ a stack trace for this exception.
            e.printStackTrace();
        }
    }
}

public class ThrowableMethod {
    public static void main(String args[]){
        //creating ArithmaticTest object
        ArithmaticThrowableClass obj = new ArithmaticThrowableClass();

        //method call
        obj.division(20, 0);
    }
}