

public class ToStringExample {
    public static void main(String[] args) {

        String st = "hello" + 25 + 'c' + 2.5; // any data type concatenate to string : String newString = aString + anInt + aChar + aDouble;
        System.out.println("st = " + st);

        ToStringGetterSetter stringObj = new ToStringGetterSetter("Hariharan", 111246);

        System.out.println("stringObj.toString() = " + stringObj.toString());
        System.out.println(stringObj);


    }
}

class ToStringGetterSetter {

    String name;
    int id;

    ToStringGetterSetter(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String toString() {
        return "name : " + name + " id : " + id;
    }
}