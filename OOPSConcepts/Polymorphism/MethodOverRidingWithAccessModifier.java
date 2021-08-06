public class MethodOverRidingWithAccessModifier extends ParentClass {

    //void msg(){
    // System.out.println("Hello java");            //C.T.Error
    // }

    public void display() {
        System.out.println("Hello hi !!");
    }

    public static void main(String[] args) {
        MethodOverRidingWithAccessModifier obj = new MethodOverRidingWithAccessModifier();
        obj.msg();
        obj.display();
    }

}

class ParentClass {
    protected void msg() {
        System.out.println("Hello !!");
    }

    public void display() {
        System.out.println("hai !");
    }
}



