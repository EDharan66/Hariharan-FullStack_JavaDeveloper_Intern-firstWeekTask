import javax.xml.crypto.dom.DOMCryptoContext;

public class DoubleExample {

    public static void main(String[] args) {

        Double d1 = Double.MAX_VALUE;
        Double d2 = Double.MIN_VALUE;
        Double d3 = Double.MIN_NORMAL;
        int i1 = Double.MIN_EXPONENT;
        int i2 = Double.MAX_EXPONENT;

        Double d4 = 26.56;
        Double d5 = 124.00;
        Double d6 = Double.parseDouble("23.8");
        Double d7 = d4/0*d5/d4;
        Double d8 = Math.sqrt(-543);

        System.out.println("d1 = " + d1+" Double.MAX_VALUE");                                      //     d1 = 1.7976931348623157E308 Double.MAX_VALUE
        System.out.println("d2 = " + d2+" Double.MIN_VALUE");                                      //     d2 = 4.9E-324 Double.MIN_VALUE
        System.out.println("d3 = " + d3+" Double.MIN_NORMAL");                                     //     d3 = 2.2250738585072014E-308 Double.MIN_NORMAL
        System.out.println("d4 = " + d4);                                                          //     d4 = 26.56
        System.out.println("d5 = " + d5);                                                          //     d5 = 124.0
        System.out.println("d6 = " + d6);                                                          //     d6 = 23.8
        System.out.println("i1 = " + i1+" Double.MIN_EXPONENT");                                   //     i1 = -1022 Double.MIN_EXPONENT
        System.out.println("i2 = " + i2+" Double.MAX_EXPONENT");                                   //     i2 = 1023 Double.MAX_EXPONENT
        System.out.println("d4.compareTo(d5) = " + d4.compareTo(d5));                              //     d4.compareTo(d5) = -1
        System.out.println("Double.compare(d5,d4) = " + Double.compare(d5, d4));                   //     Double.compare(d5,d4) = 1
        System.out.println("d4.equals(d5) = " + d4.equals(d5));                                    //     d4.equals(d5) = false
        System.out.println("d5.hashCode() = " + d5.hashCode());                                    //     d5.hashCode() = 1079967744
        System.out.println("Double.isFinite(d4/d5) = " + Double.isFinite(d4 / d5));             //     Double.isFinite(d4/d5) = true
        System.out.println("Double.isInfinite(d4/0) = " + Double.isInfinite(d4 / 0));           //     Double.isInfinite(d4/0) = true
        System.out.println("d7.isNaN() = " + d7.isNaN());                                          //     d7.isNaN() = false
        System.out.println("d7 = " + d7);                                                          //     d7 = Infinity
        System.out.println("d8.isNaN() = " + d8.isNaN());                                          //     d8.isNaN() = true
        System.out.println("d8 = " + d8);                                                          //     d8 = NaN
        System.out.println("Double.max(d4,d5) = " + Double.max(d4, d5));                           //     Double.max(d4,d5) = 124.0                                
        System.out.println("Double.sum(d4,d5) = " + Double.sum(d4, d5));                           //     Double.sum(d4,d5) = 150.56
        System.out.println("Double.toHexString(i1) = " + Double.toHexString(i1));                  //     Double.toHexString(i1) = -0x1.ffp9
        System.out.println("Double.longBitsToDouble((long) 65423) = " +                            //     Double.longBitsToDouble((long) 65423) = 3.23233E-319
                Double.longBitsToDouble((long) 65423));
        


    }
}

/**
 * byteValue()	                        -       It returns the value of Double as a byte after the conversion.
 * compare(double d1, double d2)	    -       It compares the two double values.
 * compareTo(Double another Double)	    -       It compares two Double objects numerically.
 * DoubleToLongBits(double value)	    -       It returns the representation of the floating point value provided by IEEE 754 "double format" bit layout.
 * doubleToRawLongBits(double value)	-       It returns the representation of the floating point value provided by IEEE 754 "double format" bit layout.
 * doubleValue()	                    -       It returns the value of Double as a double after the conversion.
 * equals(Object obj)	                -       It compares the object with the specified object.
 * floatValue()	                        -       It returns the float type value for the given Double object.
 * hashCode()	                        -       It returns the hash code for the given Double object.
 * hashCode(Double value)	            -       It returns the hash code for the given Double value.
 * intValue()	                        -       It returns the value of Double as an int after the conversion.
 * isFinite(double d)	                -       It returns true if the argument is finite floating point. Otherwise, returns false.
 * isInfinite()	                        -       It returns true if the double value is infinitely large in magnitude. Otherwise, returns false.
 * isInfinite(double v)	                -       It returns true if the given number is infinitely large in magnitude. Otherwise, returns false.
 * isNaN()	                            -       It returns true if the double value is Not a Number value. Otherwise, returns false.
 * IsNaN(double v)	                    -       It returns true if the specified number is Not a Number value. Otherwise, returns false.
 * longBitsToDouble(long bits)	        -       It returns the value of type Double in correspondence to the given bit representation.
 * longValue()	                        -       It returns the value of Double as a long after the conversion.
 * max(double a, double b)	            -       It returns the greater of the two double values.
 * min(double a, double b)	            -       It returns the smaller of the two double values.
 * parseDouble(String s)	            -       It returns a new double which is initialized by the value provided by the String.
 * shortValue()	                        -       It returns the value of Double as a short after the conversion.
 * sum(double a, double b)	            -       It adds the two values as per the + operator.
 * toHexString(double d)	            -       It returns a hexadecimal string represented by the double argument.
 * toString()	                        -       It returns a string represented by the Double object.
 * toString(double d)	                -       It returns a string represented by the double argument.
 * valueOf(double d)	                -       It returns the object of Double represented by a double value.
 * valueOf(String s)	                -       It returns the object of Double which holds the double value represented by string argument.
  */























