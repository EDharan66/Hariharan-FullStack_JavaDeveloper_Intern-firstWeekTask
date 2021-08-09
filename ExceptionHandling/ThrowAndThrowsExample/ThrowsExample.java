
class ArithmaticTestThrows{

    public void division(int num1, int num2)
            throws ArithmeticException{
        //java.lang.ArithmeticException here.
        System.out.println(num1/num2);
    }

    public void method1(int num1, int num2) throws Exception{
        division(num1, num2);
    }

    public void method2(int num1, int num2){
        try{
            method1(num1, num2);
        }catch(Exception e){
            System.out.println("Exception Handled");
        }
    }
}

public class ThrowsExample {

    public static void main(String args[]){
        //creating ArithmaticTest object
        ArithmaticTestThrows obj =  new ArithmaticTestThrows();

        //method call
        obj.method2(20, 0);
    }
}