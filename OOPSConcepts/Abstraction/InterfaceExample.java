

public class InterfaceExample implements Printable, Showable {
    public void print() {
        System.out.println("printable interface method");
    }

    public void show() {
        System.out.println("showable interface method");
    }

    public void display() {
        System.out.println("displayable interface method");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.print();
        obj.show();
        obj.show1();
        obj.show2();
        Printable.display();
    }


}


 interface Printable {
    void print();
    default void show2(){
        System.out.println("hi");
    }
    default void show1(){
        System.out.println("hi");
    }
    static void display(){
        System.out.println("hello");
    }
}

interface Displayable{
    void display();
}

interface Showable extends Displayable {
    void show();
}


/**
 * An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 *
 * The interface in Java is a mechanism to achieve abstraction.
 * There can be only abstract methods in the Java interface, not method body.
 * It is used to achieve abstraction and multiple inheritance in Java.
 *
 */

