public class AbstarctExample {

    public static void main(String[] args) {

        Bike obj = new Honda();

        obj.run();
        obj.changeGear();

    }
}

// Abstract class
abstract class Bike {
    // abstract constructor
    Bike() {
        System.out.println("bike is created");
    }

    // abstract method
    abstract void run();

    // non - abstract method
    void changeGear() {
        System.out.println("gear changed");
    }
}


//Creating a Child class which inherits Abstract class
class Honda extends Bike {

    void run() {
        System.out.println("running safely..");
    }

}

/**  Abstract class in Java
 *
 * A class which is declared as abstract is known as an abstract class.
 * It can have abstract and non-abstract methods. It needs to be extended and its method implemented.
 * It cannot be instantiated.
 *
 * Points to Remember
 * An abstract class must be declared with an abstract keyword.
 * It can have abstract and non-abstract methods.
 * It cannot be instantiated.
 * It can have constructors and static methods also.
 * It can have final methods which will force the subclass not to change the body of the method.
 */