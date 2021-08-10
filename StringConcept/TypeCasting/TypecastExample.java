import java.util.Arrays;
import java.util.Scanner;

public class TypecastExample {

    public static void main(String[] args) {

        String str = "12";
        String s = "hai hello";
        String strBool = "true";
        int num1 = 56;
        float num2 = 29f;
        double num3 = 26.5d;
        char ch = '3';

        Scanner sc = new Scanner(System.in);
        char[] chArr = sc.nextLine().toCharArray();

        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("str = \"" + str+"\"");
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));
        System.out.println("Double.parseDouble(str) = " + Double.parseDouble(str));
        System.out.println("Float.parseFloat(str) = " + Float.parseFloat(str));
        System.out.println("Boolean.toString(strBool) = " + Boolean.parseBoolean(strBool));
        System.out.println("Byte.parseByte(str) = " + Byte.parseByte(str));
        System.out.println("s.toCharArray() = " + Arrays.toString(s.toCharArray()));


        System.out.println("strBool = " + strBool);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("(int)str = " + (int)num3);
        System.out.println("(float)num2 = " + (float)num1);
        System.out.println("(int)ch = " + (int) ch);
    }
}

    /**
     * Widening Casting (automatically) - converting a smaller type to a larger type size
     *         byte -> short -> char -> int -> long -> float -> double
     *
     * Narrowing Casting (manually) - converting a larger type to a smaller size type
     *         double -> float -> long -> int -> char -> short -> byte
     *
     */

