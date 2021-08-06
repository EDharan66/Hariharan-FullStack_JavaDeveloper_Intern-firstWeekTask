public class MethodOverLoading {

    public static void main(String[] args) {

        Display obj = new Display();
        obj.displayDetails();
        obj.displayDetails("Hariharan");
        obj.displayDetails(111246,"Hariharan");
    }
}


class Display{

    // here we creating a same method but different parameter
    void displayDetails(){
        System.out.println("hai friend!");
    }
    void displayDetails(String name){
        System.out.println("hai "+name+"! how are you?" );
    }
    void displayDetails(int id,String name){
        System.out.println("hai "+name+"!, I think your id is"+id+"correct");
    }
}



/** Method overloading increases the readability of the program.
 *
 * There are two ways to overload the method in java
 * -By changing number of arguments
 * -By changing the data type
*/
