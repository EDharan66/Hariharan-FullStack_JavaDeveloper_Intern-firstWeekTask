
public class StringBufferMethods {


    void insert(StringBuffer str) {

        System.out.println("\nbefore insert = "+str);
        str.insert(5," friend");            // insert StringBuffer to 5th position
        System.out.println("after insert = "+str);

    }

    void replace(StringBuffer str) {

        System.out.println("\nbefore replace = "+str);
        str.replace(0,5,"hai");         // replace StringBuffer 0 to 5 as hai
        System.out.println("after replace = "+str);
    }

    void delete(StringBuffer str) {

        System.out.println("\nbefore delete = "+str);
        str.delete(0,12);                            // delete StringBuffer 0 to 12 index
        System.out.println("after delete = "+str);
    }

    void reverse(StringBuffer str) {

        System.out.println("\nbefore reverse = "+str);
        str.reverse();                               // reverse the StringBuffer
        System.out.println("after reverse = "+str);
    }

    void charAtLength(StringBuffer str) {

        System.out.println("\nchar at 5 = "+str.charAt(5));       // reverse the StringBuffer
    }

    void subString(StringBuffer str) {

        System.out.println("\nsubstring index 12 to end = "+str.substring(12));       // reverse the StringBuffer
        System.out.println("substring index 12 to 19 = "+str.substring(12,19));       // reverse the StringBuffer
    }

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println("default capacity = " + sb.capacity());      //show the default capacity of string buffer is 16 char

        sb.append("hello, welcome you all");        // here we add string to StringBuffer by append method

        System.out.println("after assigned = " + sb.capacity() + ", value = \"" + sb + "\"");      // capacity will be increase by (default capacity * 2) + 2

        sb.ensureCapacity(50);        // here we ensure the capacity upto 50

        System.out.println("sb.ensureCapacity(50) = " + sb.capacity());

        System.out.println("stringBuffer.length() = " + sb.length());

        StringBufferMethods obj = new StringBufferMethods();
        obj.insert(sb);
        obj.replace(sb);
        obj.charAtLength(sb);
        obj.subString(sb);
        obj.delete(sb);
        obj.reverse(sb);
    }
}
