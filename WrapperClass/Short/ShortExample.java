public class ShortExample {
    public static void main(String[] args) {

        Short s1 = Short.MAX_VALUE;
        Short s2 = Short.MIN_VALUE;
        Short s3 = 96;
        Short s4 = 23;
        Short s5 = Short.parseShort("8");

        System.out.println("s1 = " + s1+" Short.MAX_VALUE");
        System.out.println("s2 = " + s2+" Short.MIN_VALUE");
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s2.compareTo(s3) = " + s4.compareTo(s3));
        System.out.println("Short.compare(s3,s2) = " + Short.compare(s3, s4));
        System.out.println("s4.byteValue() = " + s4.byteValue());
        System.out.println("Short.decode(\"56\") = " + Short.decode("56"));
        System.out.println("Short.hashCode(s4) = " + Short.hashCode(s4));
        System.out.println("Short.reverseBytes(s1) = " + Short.reverseBytes(s5));

    }
}


/**
 * byteValue()	        -    It returns the value of this Short as a short
 * compare()	        -    It compares the two specified short values
 * compareTo()	        -    It compares two Short objects numerically
 * compareUnsigned()	-    It compares the two unsigned short values
 * decode()	            -    It is used to decode a String into a Short
 * doubleValue()	    -    It returns a double value for this Short object
 * equals()	            -    It is used to compare this object against the specified short object
 * floatValue()	        -    It returns the value of this Short as a Float
 * hashCode()	        -    It returns a hash code for this Short object
 * intValue()	        -    It returns an int value for this Short object
 * longValue()	        -    It returns a long value for this Short object
 * parseShort()	        -    It is used to parse the string argument as a signed decimal short.
 * reverseBytes()	    -    It returns the value fetched by reversing the order of the bytes in 2's complement representation of the given short value.
 * shortValue()	        -    It returns a short value for this Short object
 * toString()	        -    This method returns a string representation for the Short's object
 * toUnsignedInt()	    -    It is used to convert the specified short to an int by an unsigned conversion
 * toUnsignedLong()	    -    It is used to convert the specified short to a long by an unsigned conversion
 * valueOf()	        -    Returns a Short instance representing the specified short or string value.
  */
