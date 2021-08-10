
public class StringBuilderMethod {


    void insert(StringBuilder str) {

        System.out.println("\nbefore insert = "+str);
        str.insert(5," friend");            // insert StringBuilder to 5th position
        System.out.println("after insert = "+str);

    }

    void replace(StringBuilder str) {

        System.out.println("\nbefore replace = "+str);
        str.replace(0,5,"hai");         // replace StringBuilder 0 to 5 as hai
        System.out.println("after replace = "+str);
    }

    void delete(StringBuilder str) {

        System.out.println("\nbefore delete = "+str);
        str.delete(0,12);                            // delete StringBuilder 0 to 12 index
        System.out.println("after delete = "+str);
    }

    void reverse(StringBuilder str) {

        System.out.println("\nbefore reverse = "+str);
        str.reverse();                               // reverse the StringBuilder
        System.out.println("after reverse = "+str);
    }

    void charAtLength(StringBuilder str) {

        System.out.println("\nchar at 5 = "+str.charAt(5));       // reverse the StringBuilder
    }

    void subString(StringBuilder str) {

        System.out.println("\nsubstring index 12 to end = "+str.substring(12));       // reverse the StringBuilder
        System.out.println("substring index 12 to 19 = "+str.substring(12,19));       // reverse the StringBuilder
    }

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("default capacity = " + stringBuilder.capacity());      //show the default capacity of StringBuilder is 16 char

        stringBuilder.append("hello, welcome you all");        // here we add string to StringBuilder by append method

        System.out.println("after assigned = " + stringBuilder.capacity() + ", value = \"" + stringBuilder + "\"");      // capacity will be increase by (default capacity * 2) + 2

        stringBuilder.ensureCapacity(50);        // here we ensure the capacity upto 50

        System.out.println("sb.ensureCapacity(50) = " + stringBuilder.capacity());
        System.out.println("stringBuilder.length() = " + stringBuilder.length());

        StringBuilderMethod obj = new StringBuilderMethod();
        obj.insert(stringBuilder);
        obj.replace(stringBuilder);
        obj.charAtLength(stringBuilder);
        obj.subString(stringBuilder);
        obj.delete(stringBuilder);
        obj.reverse(stringBuilder);
    }
}
