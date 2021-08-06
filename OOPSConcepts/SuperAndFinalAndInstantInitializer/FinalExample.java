public class FinalExample extends Demo {

    final int a =10;

//    void sample(){
//        System.out.println("hello");          // here we try to overriding the sample method but final method cannot override
//    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();

//        obj.a = 9;                            // final variable cannot change

        System.out.println("a = " + obj.a);

        obj.sample();
    }
}

class Demo{
    final void sample(){
        System.out.println("hai");
    }
}

//        final class FinalDemo{
//
//        }
//
//        class NewDemo extends demo{           // here we try to extends FinalDemo class, but final class cannot inherit
//
//        }





/**
 * The final keyword in java is used to restrict the user.
 *
 * The java final keyword can be used in many context.
 * -variable
 * -method
 * -class
 *
 */