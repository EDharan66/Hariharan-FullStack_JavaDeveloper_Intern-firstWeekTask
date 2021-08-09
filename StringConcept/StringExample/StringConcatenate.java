public class StringConcatenate {

    public static void main(String[] args) {


        String str1 = "hello";
        String str2 = "hai";
        String str3 = "!!!";

        int num1 = 5;
        int num2 = 10;

        // concatenate with method
        System.out.println("str1.concat(str2).concat(str3) = " + str1.concat(str2).concat(str3));

        // with + operator
        System.out.println(str1+" "+str2+" "+str3);
        System.out.println(num1+num2);
        System.out.println(str1+num1+num2);

    }
}
