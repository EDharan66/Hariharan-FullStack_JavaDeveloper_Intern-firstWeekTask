public class StringMethods {

    void withMethods(String str) {

        System.out.println("str.startsWith(\"Welcome\") = "+str.startsWith("Welcome"));
        System.out.println("str.endsWith(\"all\") = "+str.endsWith("all"));

    }

    void charAtAndIndexOf(String str) {

        System.out.println("charAt(6) = " + str.charAt(6));
        System.out.println("indexOf(a) = " + str.indexOf('a'));
        System.out.println("indexOf(a) = " + str.lastIndexOf('a'));
    }

    void substring(String word){

        System.out.println(word.substring(0,18));
        System.out.println(word.substring(19,word.length()));
        System.out.println(word.substring(8));
    }

    void toUpperToLower(String word){

        System.out.println("word.toLowerCase() = " + word.toLowerCase());
        System.out.println("word.toUpperCase() = " + word.toUpperCase());
    }

    void stringIntern(String word){

        String str = word.intern();
        System.out.println("str = "+str);

    }

    public static void main(String[] args) {

        String word = "Welcome every one, have a nice day";

        System.out.println(word);

        System.out.println("word.length() = " + word.length());

        StringMethods obj = new StringMethods();

        obj.withMethods(word);
        obj.charAtAndIndexOf(word);
        obj.substring(word);
        obj.toUpperToLower(word);
        obj.stringIntern(word);


    }

}