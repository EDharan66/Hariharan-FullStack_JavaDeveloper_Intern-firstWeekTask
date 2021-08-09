public class StringCompareExample {
    public static void main(String[] args) {


        String str1 = "hi hello";
        String str2 = "hi hello";
        String str3 = new String("hi hello");
        String str4 = "Hi Hello";
        String str5 = "welcome!!";


        // by == operator to compare
        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1 == str3) = " + (str1 == str3));
        System.out.println("(str1 == str5) = " + (str1 == str3));

        // by equal() and equalIgnoreCase() method
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str1.equals(str4) = " + str1.equalsIgnoreCase(str4));
        System.out.println("str1.equals(str5) = " + str1.equals(str5));

        // by compareTo() and compareIgnoreCase() method
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3) = " + str1.compareTo(str3));
        System.out.println("str1.compareTo(str4) = " + str1.compareTo(str4));
        System.out.println("str1.compareTo(str5) = " + str1.compareTo(str5));

    }
}
