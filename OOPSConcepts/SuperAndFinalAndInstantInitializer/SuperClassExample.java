public class SuperClassExample {

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
        obj.show();
    }
}

class Parent{
    int a = 10;

     Parent(){
         System.out.println("super() constructor called");
     }

    void display(){
        System.out.println("super() method called");
    }
}

class ChildClass extends Parent {

        ChildClass(){
            super();
        }

        void show(){
            System.out.println("super variable : "+super.a);
            super.display();
        }
}

/***
 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 *
 * -super can be used to refer immediate parent class instance variable.
 * -super can be used to invoke immediate parent class method.
 * -super() can be used to invoke immediate parent class constructor.
 */