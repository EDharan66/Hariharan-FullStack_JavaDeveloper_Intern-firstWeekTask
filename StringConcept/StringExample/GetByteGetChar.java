import java.io.UnsupportedEncodingException;

public class GetByteGetChar {

    void getCharMethod(String str) {
        char[] ch = new char[20];

        try {
            str.getChars(1, 6, ch, 1);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    void getByteMethod(String str) {


        try {
            byte[] barr = str.getBytes();

            for (int i = 0; i < barr.length; i++) {
                System.out.print(barr[i]+" ");
            }

            byte[] barr1 = str.getBytes("ISO-8859-1");
            System.out.println("\nbarr1 = ");
            for (int i = 0; i < barr.length; i++) {
                System.out.print(barr1[i]+" ");
            }

            byte[] barr2 = str.getBytes("UTF-16BE");
            System.out.println("\nbarr2 = " );
            for (int i = 0; i < barr.length; i++) {
                System.out.print( barr2[i]+" ");
            }
            byte[] barr3 = str.getBytes("UTF-16");
            System.out.println("\nbarr3 = " );
            for (int i = 0; i < barr.length; i++) {
                System.out.print( barr3[i]+" ");
            }
            byte[] barr4 = str.getBytes("UTF-16LE");
            System.out.println("\nbarr4 = " );
            for (int i = 0; i < barr.length; i++) {
                System.out.print( barr4[i]+" ");
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("UnsupportedEncodingException = " + e);
        }


    }

    public static void main(String[] args) {

        String str = new String("Welcome all");
        GetByteGetChar obj = new GetByteGetChar();
        obj.getCharMethod(str);
        obj.getByteMethod(str);


    }

}

/**
 * US-ASCII     : Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set
 * ISO-8859-1   : ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1
 * UTF-8        : Eight-bit UCS Transformation Format
 * UTF-16BE     : Sixteen-bit UCS Transformation Format, big-endian byte order
 * UTF-16LE     : Sixteen-bit UCS Transformation Format, little-endian byte order
 * UTF-16       : Sixteen-bit UCS Transformation Format, byte order identified by an optional byte-order mark.
 */
