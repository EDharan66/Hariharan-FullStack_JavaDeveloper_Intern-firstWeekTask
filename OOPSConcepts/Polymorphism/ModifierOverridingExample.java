class Student1 {

     public void show(){
        System.out.println("Student details.");
    }
}


public class ModifierOverridingExample extends Student1 {

     public void show(){        //compile-time error if put Access modifier as private or public
        System.out.println("College Student details.");
    }

    //main method
    public static void main(String args[]){
        ModifierOverridingExample obj = new ModifierOverridingExample();
        //subclass overrides super class method
        //hence method of CollegeStudant class will be called.
        obj.show();
    }
}

/**
 * Role of access modifiers in method overriding:
 * Access modifier of overridden method in subclass can’t be more restrictive than in super class.
 *  Otherwise it will throw an exception.
 */
