public class LongExample {

    public static void main(String[] args) {

        Long x1=67l;
        Long x2=98l;
        Long x3=6l;
        Long x4=-96l;
        Long x5 = Long.parseLong("785");
        Long l1 = Long.MAX_VALUE;
        Long l2 = Long.MIN_VALUE;


        System.out.println("l1 = " + l1+" Long.MAX_VALUE");                                       //   l1 = 9223372036854775807 Long.MAX_VALUE
        System.out.println("l2 = " + l2+" Long.MIN_VALUE");                                       //   l2 = -9223372036854775808 Long.MIN_VALUE
        System.out.println("x1 = " + x1);                                                         //   x1 = 67
        System.out.println("x2 = " + x2);                                                         //   x2 = 98
        System.out.println("x3 = " + x3);                                                         //   x3 = 6
        System.out.println("x4 = " + x4);                                                         //   x4 = -96
        System.out.println("x5 = " + x5);                                                         //   x5 = 785

        System.out.println("x1.compareTo(x2) = " + x1.compareTo(x2));                             //   x1.compareTo(x2) = -1
        System.out.println("Long.compare(x2,x3) = " + Long.compare(x2, x3));                      //   Long.compare(x2,x3) = 1
        System.out.println("Long.compare(x4,x5) = " + Long.compare(x4, x5));                      //   Long.compare(x4,x5) = -1
        System.out.println("l1.hashCode() = " + l1.hashCode());                                   //   l1.hashCode() = -2147483648
        System.out.println("Long.divideUnsigned(x4,x5) = " + Long.divideUnsigned(x4, x5));        //   Long.divideUnsigned(x4,x5) = 23499037036572677
        System.out.println("x1.equals(x2) = " + x1.equals(x2));                                   //   x1.equals(x2) = false
        System.out.println("Long.highestOneBit(l1) = " + Long.highestOneBit(l1));                 //   Long.highestOneBit(l1) = 4611686018427387904
        System.out.println("Long.lowestOneBit(l2) = " + Long.lowestOneBit(l2));                   //   Long.lowestOneBit(l2) = -9223372036854775808
        System.out.println("Long.max(x3,x2) = " + Long.max(x3, x2));                              //   Long.max(x3,x2) = 98
        System.out.println("Long.min(x2,x5) = " + Long.min(x2, x5));                              //   Long.min(x2,x5) = 98
        System.out.println("Long.reverse(l1) = " + Long.reverse(l1));                             //   Long.reverse(l1) = -2
        System.out.println("Long.reverseBytes(l2) = " + Long.reverseBytes(l2));                   //   Long.reverseBytes(l2) = 128


    }
}


/**
 * bitCount(long i)	                                -   It returns the number of one bits in two?s compliment binary representation.
 * byteValue()	                                    -   It returns the value of Long as a byte after the conversion.
 * compare(long x, long y)	                        -   It compares the two long values.
 * compareTo(long another long)	                    -   It compares two long objects numerically.
 * compareUnsigned(long x, long y)	                -   It compares the two long values keeping the values unsigned.
 * decode(String nm)	                            -   It is used to decode a string into Long.
 * divideUnsigned(long dividend, long divisor)	    -   It returns the unsigned quotient for dividing the first argument by the second.
 * doubleValue()	                                -   It returns the value of Long as a double after the conversion.
 * equals(Object obj)	                            -   It compares the object with the specified object.
 * floatValue()	                                    -   It returns the float type value for the given Long object.
 * getLong(String nm)	                            -   It determines the long value for the specified name.
 * getLong(String nm, Long val)	                    -   It returns the long value for the specified name.
 * hashCode()	                                    -   It returns the hash code for the given Long object.
 * hashCode(Long value)	                            -   It returns the hash code for the given Long value.
 * highestOneBit(long i)	                        -   It returns a long value with at most one single bit in the highest order.
 * intValue()	                                    -   It returns the value of Long as an int after the conversion.
 * longValue()	                                    -   It returns the value of Long as a long after the conversion.
 * lowestOneBit(long i)	                            -   It returns a long value with at most one single bit in the lowest order.
 * max(long a, long b)	                            -   It returns the greater of the two long values.
 * min(long a, long b)	                            -   It returns the smaller of the two long values.
 * numberOfLeadingZeroes(long i)	                -   It returns the total number of zero bytes in the highest order.
 * numberOfTrailingZeroes(long i)	                -   It returns the total number of zero bytes in the lowest order.
 * parseLong(CharSequence s, int beginIndex,
                    int endIndex, int radix)	    -   It parses the CharSequence arguementwith a specified long in the given index
 * parseLong(String s)	                            -   It parses the string parameter as a signed decimal long.
 * parseLong(String s, int radix)	                -   It parses the string argument as a signed long as given in the radix.
 * parseUnsignedLong(CharSequence s,
            int beginIndex, int ndIndex, int radix)	-   It parses the given CharSequence argument as an unsigned long in the given radix beginning from beginIndex and ending till endIndex-1.
 * parseUnsignedLong(String s)	                    -   It parses the given string argument as an unsigned long.
 * parseUnsignedLong(String s, int radix)	        -   It parses the given string argument as an unsigned long in the index specified by the second argument.
 * remainderUnsigned(long dividend, long divisor)	-   It returns the unsigned remainder from dividing the first argument with the second argument.
 * reverse(long i)	                                -   It returns the value obtained by the reversing the given order of bits in 2?s complement binary representation.
 * reverseBytes(long i)	                            -   It returns the value obtained by the reversing the given order of bits in 2?s complement representation.
 * rotateLeft(long i, int distance)	                -   It returns the value obtained by rotating the 2?s complement binary representation of the given long value by left and by the specified number of bits.
 * rotateRight(long i, int distance)	            -   It returns the value obtained by rotating the 2?s complement binary representation of the given long value by right and by the specified number of bits.
 * shortValue()	                                    -   It returns the short type value for the given Long object.
 * signum(long i)	                                -   It returns the signum function for the given long value.
 * sum(long a, long b)	                            -   It adds two long values as per the + operator.
 * toBinaryString(long i)	                        -   It returns the string representation for the given long argument as an unsigned argument with base 2.
 * toHexString(long i)	                            -   It returns the string representation for the given long argument as an unsigned argument with base 16.
 * toOctalString(long i)	                        -   It returns the string representation for the given long argument as an unsigned argument with base 8.
 * toString()	                                    -   It returns the string which represents the long value.
 * toString(long i)	                                -   It returns the string which represents the specified long.
 * toString(long i, int radix)	                    -   It returns the string representation for the first argument which is specified by the second argument.
 * toUnsignedString(long i)	                        -   It returns the string representation for the argument as an unsigned decimal value.
 * toUnsignedString(long i, int radix)	            -   It returns the string representation for the first argument as an unsigned integer value in the radix.
 * valueOf(l)	                                    -   It returns a long instance which represents the specified value.
 * valueOf(String s)	                            -   It returns a long instance which holds the value of specified string.
 * valueOf(String s int radix)	                    -   It returns the Long object which holds the value of specified string when parsed with the radix provided by the second argument
  */
