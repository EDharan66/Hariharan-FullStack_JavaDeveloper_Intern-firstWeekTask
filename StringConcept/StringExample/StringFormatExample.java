public class StringFormatExample {

    public static void main(String[] args) {
        String str1 = String.format("%d", 111246);          // Integer value
        System.out.println(str1);

        String str2 = String.format("%s", "Hariharan");     // String value
        System.out.println(str2);

        String str3 = String.format("%f", 2.00);            // Float value
        System.out.println(str3);

        String str4 = String.format("%x", 12254);           // Hexadecimal value
        System.out.println(str4);

        String str5 = String.format("%c", 'h');             // Char value
        System.out.println(str5);

        String str6 = String.format("%d", 66);
        System.out.println(str6);

        String str7 = String.format("|%10d|", 99);          // Specifying length of integer
        System.out.println(str7);

        String str8 = String.format("|%-10d|", 1);          // Left-justifying within the specified width
        System.out.println(str8);

        String str9 = String.format("|% d|", 6);
        System.out.println(str9);

        String str10 = String.format("|%010d|", 101);       // Filling with zeroes
        System.out.println(str10);
    }


}


/**
 * %a	floating point0 :     (except BigDecimal)   Returns Hex output of floating point number.
 * %b	Any type	    :     "true" if non-null, "false" if null
 * %c	character	    :     Unicode character
 * %d	integer         :     (incl.byte, short, int, long, bigint)	Decimal Integer
 * %e	floating point  :	  decimal number in scientific notation
 * %f	floating point  :	  decimal number
 * %g	floating point  :	  decimal number, possibly in scientific notation depending on the precision and value.
 * %h	any type        :     Hex String of value from hashCode() method.
 * %n	none	        :     Platform-specific line separator.
 * %o	integer         :     (incl. byte, short, int, long, bigint)	Octal number
 * %s	any type        :	  String value
 * %t	Date/Time       :     (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions.
 * More formatting flags are needed after this. See Date/Time conversion below.
 * %x	integer         :     (incl. byte, short, int, long, bigint)    Hex string.
 * <p>
 * <p>
 * Internal implementation
 * <p>
 * public static String format(String format, Object... args) {
 * return new Formatter().format(format, args).toString();
 * }
 */

/**
 *
 *  Internal implementation
 *
 *  public static String format(String format, Object... args) {
 *  return new Formatter().format(format, args).toString();
 *  }
 *
 */
