public class ObjectCreationAbstarct {
    public static void main(String[] args) {

        AbstractSuper obj1 = new AbstractSuper() {};
        obj1.show();

        AbstractSuper obj2 = new AbstractSuper() {
            @Override
            void show() {
                super.show();
            }
        };
        obj2.show();

        AbstractSuper obj3 = new SubClassOfAbstract();
        obj3.show();
    }
}


abstract class AbstractSuper{


     void show(){
        System.out.println("hi, hello!!");
    }
}

class SubClassOfAbstract extends AbstractSuper{
    @Override
    void show() {
        super.show();
    }
}