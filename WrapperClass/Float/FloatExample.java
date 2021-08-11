public class FloatExample {

    public static void main(String[] args) {

        Float f1 = new Float(4863);
        Float f2 = 2872f;
        Float f3 = Float.MAX_VALUE;
        Float f4 = Float.MIN_NORMAL;
        Float f5 = Float.MIN_VALUE;
        int i1 = Float.MAX_EXPONENT;
        int i2 = Float.MIN_EXPONENT;
        Float f8 = Float.parseFloat("2545f");

        System.out.println("f1 = " + f1);                                               //    f1 = 4863.0
        System.out.println("f2 = " + f2);                                               //    f2 = 2872.0
        System.out.println("f3 = " + f3+" Float.MAX_VALUE");                            //    f3 = 3.4028235E38 Float.MAX_VALUE
        System.out.println("f4 = " + f4+" Float.MIN_NORMAL");                           //    f4 = 1.17549435E-38 Float.MIN_NORMAL
        System.out.println("f5 = " + f5+" Float.MIN_VALUE");                            //    f5 = 1.4E-45 Float.MIN_VALUE
        System.out.println("f8 = " + f8+" Float.MAX_EXPONENT");                         //    f8 = 2545.0 Float.MAX_EXPONENT
        System.out.println("i1 = " + i1);                                               //    i1 = 127
        System.out.println("i2 = " + i2+" Float.MIN_EXPONENT");                         //    i2 = -126 Float.MIN_EXPONENT
        System.out.println("Float.compare(f1,f2) = " + Float.compare(f1, f2));          //    Float.compare(f1,f2) = 1
        System.out.println("f8.compareTo(f2) = " + f8.compareTo(f2));                   //    f8.compareTo(f2) = -1
        System.out.println("f1.equals(f2) = " + f1.equals(f2));                         //    f1.equals(f2) = false
        System.out.println("f3.hashCode() = " + f3.hashCode());                         //    f3.hashCode() = 2139095039



    }
}


/**
 * byteValue()	        -       Returns the value of this float as a byte
 * compare()	        -       Compares the two specified float values
 * compareTo()	        -       Compares two float objects numerically
 * doubleValue()	    -       Returns a double value for this Float object
 * equals()	            -       Compares the object against the specified object
 * floatToIntBits()	    -       Returns a representation of floating-point value according to IEEE floating-point "single format " bit layout
 * floatToRawIntBits()	-       Returns a representation of floating-point value according to IEEE floating-point "single format" bit layout preserving NaN values.
 * floatValue()	        -       Returns the float value of this Float object
 * hashCode()	        -       Returns a hash code for this Float object
 * intBitsToFloat()	    -       Returns the float value for the given bit representation
 * intValue()	        -       Returns an int value for this Float object
 * isFinite()	        -       Returns a Boolean value 'true', if the argument is a finite floating-point value
 * isInfinite()	        -       Returns a Boolean value 'true', if this float value or the specified number is infinitely large in magnitude
 * isNan()	            -       Returns a Boolean value 'true', if the specified number is NaN(Not a Nan) value.
 * longValue()	        -       Returns a long value for this float object
 * max()	            -       Returns the greatest of two float values and gives the same result as by calling Math.max
 * min()	            -       Returns the smallest of two float values
 * parseFloat()	        -       Returns a new float initialized to the value of the specified String
 * shortValue()	        -       Returns a short value for this Float object
 * sum()	            -       Adds the two float values together
 * toHexString()	    -       Returns a hexadecimal string representation of the float argument.
 * toString()	        -       Returns a string representation of the Float object
 * valueOf()	        -       Returns a Float instance representing the specified float or string value.
 */

