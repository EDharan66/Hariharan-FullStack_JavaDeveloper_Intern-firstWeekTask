class SuperClass {
    public SuperClass()
    {
        System.out.println("SuperClass constructor.");
    }

    public void show()
    {
        System.out.println("SuperClass method.");
    }
}

public class ConstructInheritedExample extends SuperClass{
    public static void main(String[] args)
    {
        ConstructInheritedExample object1 = new ConstructInheritedExample(); // allowed
        object1.show(); // allowed
//        object1.SuperClass(); // not allowed
//        ConstructInheritedExample object2 = new SuperClass(); // not allowed
    }
}
