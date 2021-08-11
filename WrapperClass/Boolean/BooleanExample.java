public class BooleanExample {

    public static void main(String[] args) {

        Boolean b1 = true;
        Boolean b2 = false;
        String  stbool = "true";
        String stboolf = Boolean.toString(false);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("stbool = " + stbool);
        System.out.println("stboolf = " + stboolf);
        System.out.println("Boolean.compare(b1,b2) = " + Boolean.compare(b1, b2));
        System.out.println("b1.compareTo(b2) = " + b1.compareTo(b2));
        System.out.println("b1.equals(b2) = " + b1.equals(b2));
        System.out.println("Boolean.getBoolean(stbool) = " + Boolean.getBoolean(stbool));
        System.out.println("Boolean.logicalAnd(b1,b2) = " + Boolean.logicalAnd(b1, b2));
        System.out.println("Boolean.logicalOr(b1,b2) = " + Boolean.logicalOr(b1, b2));
        System.out.println("Boolean.logicalXor(b1,b2) = " + Boolean.logicalXor(b1, b2));
        System.out.println("b1.hashCode() = " + b1.hashCode());
    }
}

/**
 * booleanValue()   -	Returns a Boolean primitive for the value of this Boolean object.
 * compare()	    -   Compares two Boolean values.
 * compareTo()	    -   Compares this Boolean instance with another.
 * equals()	        -   Returns a Boolean value true if the argument is a Boolean object that represents the same value as this object.
 * getBoolean()	    -   Returns a Boolean value true if the system property name is equal to the string "true".
 * hashCode()	    -   Returns a hash code for the Boolean object.
 * logicalAnd()	    -   Returns the result of implementing logical AND operation on the assigned boolean operands.
 * logicalOr()	    -   Returns the result of implementing logical OR operation on the assigned boolean operands.
 * logicalXor()	    -   Returns the result of implementing logical XOR operation on the assigned boolean operands.
 * parseBoolean()   -	Parses the string argument as a Boolean.
 * toString()	    -   Returns a String instance representing the specified Boolean's value or the specified boolean.
 * valueOf()	    -   Returns a Boolean instance representing the specified Boolean value or string value.
  */
