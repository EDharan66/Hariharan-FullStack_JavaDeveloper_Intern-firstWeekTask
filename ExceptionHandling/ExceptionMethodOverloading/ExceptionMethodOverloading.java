import java.io.IOException;
import java.sql.SQLDataException;

class SuperClassException{
    public void display()  {
        System.out.println("Super class.");
    }
}

class SubClass extends SuperClassException {
    //Compile time error here.
    public void display() throws ArithmeticException {
        System.out.println("Sub class.");
    }
}
public class ExceptionMethodOverloading {
    public static void main(String[] args)  {
        //Creating subclass object.
        SuperClassException obj = new SubClass();

        //method call.
        obj.display();
    }
}


/** Types of Exception:
 *
 * Checked exception - IOException,SQLException, ClassNotFoundException etc,.
 *
 * Unchecked exception - ArithmeticException, NullPointerException, IndexOutOfBoundsException etc,.
 *
 * Error - OutOfMemoryError, StackOverFlowError, VirtualMachineError etc,.
 *
 */

/**
 * If the super class method does not declare an exception then subclass overridden method
 * cannot declare the checked exception.
 *
 * - error
 *
 * If the super class method does not declare an exception then subclass overridden method
 * can declare unchecked exception.
 *
 * - execute output "subclass"
 *
 * If the super class method declares an exception then subclass overridden method
 * can declare same exception.
 *
 * - execute output "subclass"
 *
 * If the super class method declares an exception then subclass overridden method
 * can declare subclass exception
 *
 * - execute output "subclass"
 *
 * If the super class method declares an exception then subclass overridden method
 * can declare no exception.
 *
 * - execute output "subclass"
 *
 * If the super class method declares an exception then subclass overridden method
 * cannot declare parent exception.
 *
 * - error
 */
