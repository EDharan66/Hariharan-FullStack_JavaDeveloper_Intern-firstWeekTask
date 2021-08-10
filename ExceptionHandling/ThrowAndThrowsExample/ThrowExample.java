
class ArithmaticTest{
    /**
     * This method is used to divide two integers.
     * @param num1
     * @param num2
     *
     */
    public void division(int num1, int num2){
        try{
            //java.lang.ArithmeticException here.
            if(num2 == 0){
                throw new ArithmeticException();
            }else{
                System.out.println(num1/num2);
            }


        }catch(ArithmeticException e){
            //throw exception.

            System.out.println(e);
        }finally {
            System.out.println("finally will execute");
        }

        System.out.println("Remaining code after exception handling.");
    }
}

public class ThrowExample {

    public static void main(String[] args){
        //creating ArithmaticTest object
        ArithmaticTest obj =  new ArithmaticTest();

        //method call
        obj.division(20, 0);
    }
}