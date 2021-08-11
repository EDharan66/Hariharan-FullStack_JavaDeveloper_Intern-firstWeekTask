import java.math.BigInteger;

public class ByteClassExample {

    public static void main(String[] args) {

        byte b1 =24;
        Byte b2 = 37;
        Byte b4 = b1;                   // Byte.valueOf(b1) or autoboxing
        Byte b7 = Byte.MAX_VALUE;
        Byte b8 = Byte.MIN_VALUE;
        String st = "123";
        String st1 = "Byte.MAX_VALUE";

        byte b3 = b2;                   // b2.byteValue() or unboxing
        byte b5 = -7;
        byte b6 = -13;

        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b2.compareTo(b4) = " + b2.compareTo(b4) +", difference compare to b2(Byte) to b4(Byte)");
        System.out.println("b4.compareTo(b3) = " + b4.compareTo(b3) +", difference compare to b4(Byte) to b3(byte)");
        System.out.println("Byte.compare(b1,b3) = " + Byte.compare(b1, b3) + " use either primitive or non primitive");
        System.out.println("Byte.compare() with unsigned = " + Byte.compare(b6,b5));

        System.out.println("b7 = " + b7+" Byte.MAX_VALUE");
        System.out.println("b8 = " + b8+" Byte.MIN_VALUE");
        System.out.println("Byte.decode(st) = " + Byte.decode(st));
        System.out.println("Byte.hashCode(b7) = " + Byte.hashCode((byte) -9.765));
        System.out.println("Byte.hashCode(b8) = " + Byte.hashCode(b8));
        System.out.println("Byte.toUnsignedInt(b6) = " + Byte.toUnsignedInt(b6));
        System.out.println("Byte.toUnsignedLong(b6) = " + Byte.toUnsignedLong(b5));
        System.out.println("Byte.toUnsignedInt((byte)1) = " + Byte.toUnsignedInt((byte) -1));
    }
}

/**
 * byteValue()	     -   It returns the value of this Byte as a byte
 * compare()	     -   It compares the two specified byte values
 * compareTo()	     -   It compares two Byte objects numerically
 * compareUnsigned() - 	 It compares the two unsigned byte values
 * decode()	         -   It is used to decode a String into a Byte
 * doubleValue()	 -   It returns a double value for this Byte object
 * equals()	         -   It is used to compare this object against the specified byte object
 * floatValue()	     -   It returns the value of this Byte as a Float
 * hashCode()	     -   It returns a hash code for this Byte object
 * intValue()	     -   It returns an int value for this Byte object
 * longValue()	     -   It returns a long value for this Byte object
 * parseByte()	     -   It is used to parse the string argument as a signed decimal byte.
 * shortValue()	     -   It returns a short value for this Byte object
 * toString()	     -   It returns a string representation of the Byte object
 * toUnsignedInt()	 -   It is used to convert the specified byte to an int by an unsigned conversion
 * toUnsignedLong()	 -   It is used to convert the specified byte to a long by an unsigned conversion
 * valueOf()	     -   Returns a Byte instance representing the specified byte or string value.
  */
