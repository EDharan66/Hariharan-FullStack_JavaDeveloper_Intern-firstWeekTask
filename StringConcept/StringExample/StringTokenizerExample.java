import java.util.StringTokenizer;

enum DemoEnum{
    hi,hello,welcome,everyone,have,a,nice,day
        }

public class StringTokenizerExample {

    public static void main(String[] args) {

        String str = new String("hello,welcome:you;all");

        StringTokenizer stringTokenizer = new StringTokenizer(str,", : ;");

        System.out.println("count = "+stringTokenizer.countTokens());   // count token

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }




    }

}

/**
 * A delimiter is one or more characters that separate text strings.
 * Common delimiters are commas (,), semicolon (;), quotes ( ", ' ), braces ({}), pipes (|), or slashes ( / \ ).
 * When a program stores sequential or tabular data, it delimits each item of data with a predefined character.
 */

/**
 * The java.util.StringTokenizer class allows an application to break a string into tokens.
 *
 * -This class is a legacy class that is retained for compatibility reasons although its use is discouraged in new code.
 * -Its methods do not distinguish among identifiers, numbers, and quoted strings.
 * -This class methods do not even recognize and skip comments.
 *
 */

/**
 * int countTokens() - checks whether more tokens are available or not.
 *                      It returns true if more takens are available else return false.
 * boolean hasMoreElements() - same as hasMoreTokens() , mainly used in case of enumeration.
 * boolean hasMoreTokens() - returns the next token from this string tokenizer.
 * Object nextElement() - returns the next token from this string tokenizer using specified delimeter.
 *                        It is mainly used when we want to separate tokens using differen delimiters in single string tokenizer.
 * String nextToken() - same as nextToken() except that it returns an object rather than string.
 *                       It is mainly used in case of enumeration.
 * String nextToken(String delim) -  returns the number of times nextToken method can be called on this string tokenizer before an exception occur.
 */

