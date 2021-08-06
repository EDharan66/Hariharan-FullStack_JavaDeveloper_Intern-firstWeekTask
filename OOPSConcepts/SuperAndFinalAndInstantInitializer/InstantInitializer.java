public class InstantInitializer {

    public static void main(String[] args) {

        InitializerParentClass obj = new InitializerParentClass();

    }
}

class InitializerParentClass {
    InitializerParentClass() {
        System.out.println("Constructor called");
    }

    {
        System.out.println("instance initializer block Called");
    }
}

/**
 * There are mainly three rules for the instance initializer block. They are as follows:
 * -The instance initializer block is created when instance of the class is created.
 * -The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
 * -The instance initializer block comes in the order in which they appear.
 */