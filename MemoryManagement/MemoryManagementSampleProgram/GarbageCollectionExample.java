public class GarbageCollectionExample {

    public void finalize(){
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {

        //object create
        GarbageCollectionExample object1 = new GarbageCollectionExample();
        GarbageCollectionExample object2 = new GarbageCollectionExample();

        //object initialize
        object1 = null; // here object1 referenced to null, so minor gc performed to collect
        object2 = null; // here object1 referenced to null, so minor gc performed to collect

        //call garbageCollect
        System.gc();
    }
}
