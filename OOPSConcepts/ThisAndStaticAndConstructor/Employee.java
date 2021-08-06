public class Employee {

    public static void main(String[] args) {

        // creating a object with argument pass by constructor
        Details obj1 = new Details(111246,"Hariharan");

        // display the details
        obj1.display();

        // try to change domain name by static method,
        // no need to create a object for call static variable or method
        Details.domainChange();

        // creating a another object with argument pass by constructor
        Details obj2 = new Details(111246,"Hariharan");

        // display the details
        obj2.display();

    }
}

class Details{

    // instance variable
    int empId;
    String name;

    // final variable
    final String company = "Full Creative";

    // static variable
    static String domain = "Developer";


    // constructor for Details class
    Details(int empId,String name){
        this.empId = empId;  // this keyword used for accessing current class variable
        this.name = name; // this keyword used for accessing current class variable
    }

    // static method
    static public void domainChange(){
        domain = "Full stack java developer"; // for static variable don't use this keyword for static method
    }

    // display method
    public void display(){
        System.out.println("employee name : "+this.name+", id : "+this.empId+", domain : "+domain+", company : "+this.company);
    }


}

/** We can apply static keyword with
 *
 * Variable (also known as a class variable)
 * Method (also known as a class method)
 * Block
 * Nested class
 * */

/** Usage of Java this keyword, Here is given the 6 usage of java this keyword.
 *
 * this can be used to refer current class instance variable.
 * this can be used to invoke current class method (implicitly)
 * this() can be used to invoke current class constructor.
 * this can be passed as an argument in the method call.
 * this can be passed as argument in the constructor call.
 * this can be used to return the current class instance from the method.
 * */