package lesson170627;

import static lesson170627.SimpleUnit.*;

/**
 * Created by Megmeehey on 27.06.2017.
 */
public class Tests {
    public static void main(String[] args) {
        System.out.println("Testing utils");

        Converter converter = new Converter();
        dropTestNumber();
        // Start test
        System.out.println(assertEquals(converter.toString(31, 16), Integer.toHexString(31).toUpperCase()));

        // toBinaryString tests

        System.out.println(assertEquals(converter.toBinaryString(255), Integer.toBinaryString(255)));
        System.out.println(assertEquals(converter.toBinaryString(1024), Integer.toBinaryString(1024)));
        System.out.println(assertEquals(converter.toBinaryString(4096), Integer.toBinaryString(4096)));
        // borders
        System.out.println(assertEquals(converter.toBinaryString(Integer.MAX_VALUE), Integer.toBinaryString(Integer.MAX_VALUE)));
        System.out.println(assertEquals(converter.toBinaryString(0), Integer.toBinaryString(0)));
        /* System.out.println(converter.toBinaryString(Integer.MIN_VALUE));
        * ^ Won't work, because I using Math.abs(number) solution. So, Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE
        * due to int size. Gonna make another solution.
        */
        System.out.println(assertEquals(converter.toBinaryString(Integer.MIN_VALUE + 1), "-1111111111111111111111111111111"));
        // negative
        System.out.println(assertEquals(converter.toBinaryString(-1024),  "-10000000000"));
        System.out.println(assertEquals(converter.toBinaryString(-111),  "-1101111"));
        System.out.println(assertEquals(converter.toBinaryString(-2),  "-10"));

        // toOctalString tests
        System.out.println(assertEquals(converter.toOctalString(255),  Integer.toOctalString(255)));
        System.out.println(assertEquals(converter.toOctalString(8),  Integer.toOctalString(8)));
        System.out.println(assertEquals(converter.toOctalString(7),  Integer.toOctalString(7)));
        System.out.println(assertEquals(converter.toOctalString(256),  Integer.toOctalString(256)));
        // borders
        System.out.println(assertEquals(converter.toOctalString(Integer.MAX_VALUE),  Integer.toOctalString(Integer.MAX_VALUE)));
        System.out.println(assertEquals(converter.toOctalString(0),  Integer.toOctalString(0)));
        System.out.println(assertEquals(converter.toOctalString(Integer.MIN_VALUE + 1),  "-17777777777"));
        // negative
        System.out.println(assertEquals(converter.toOctalString(-256),  "-400"));
        System.out.println(assertEquals(converter.toOctalString(-56),  "-70"));
        System.out.println(assertEquals(converter.toOctalString(-351),  "-537"));

        // toHexString tests
        System.out.println(assertEquals(converter.toHexString(255),  Integer.toHexString(255).toUpperCase()));
        System.out.println(assertEquals(converter.toHexString(256),  Integer.toHexString(256).toUpperCase()));
        System.out.println(assertEquals(converter.toHexString(4096),  Integer.toHexString(4096).toUpperCase()));
        System.out.println(assertEquals(converter.toHexString(10),  Integer.toHexString(10).toUpperCase()));
        // borders
        System.out.println(assertEquals(converter.toHexString(Integer.MAX_VALUE),  Integer.toHexString(Integer.MAX_VALUE).toUpperCase()));
        System.out.println(assertEquals(converter.toHexString(0), Integer.toHexString(0)));
        System.out.println(assertEquals(converter.toHexString(Integer.MIN_VALUE + 1), "-7FFFFFFF"));
        // negative
        System.out.println(assertEquals(converter.toHexString(-10),  "-A"));
        System.out.println(assertEquals(converter.toHexString(-128),  "-80"));
        System.out.println(assertEquals(converter.toHexString(-255),  "-FF"));

        // toString(int, int) tests
        System.out.println(assertEquals(converter.toString(255, 16),  Integer.toHexString(255).toUpperCase()));
        System.out.println(assertEquals(converter.toString(8, 3), "22"));
        System.out.println(assertEquals(converter.toString(72, 31), "2A"));
        System.out.println(assertEquals(converter.toString(73, 25), "2N"));
        System.out.println(assertEquals(converter.toString(71, 71), Converter.getErrorMessage()));
        System.out.println(assertEquals(converter.toString(39, 19), "21"));
        System.out.println(assertEquals(converter.toString(120, 12), "A0"));
        // negative
        System.out.println(assertEquals(converter.toString(-1, 2),  "-1"));
        System.out.println(assertEquals(converter.toString(-255, 16),  "-FF"));
        System.out.println(assertEquals(converter.toString(-1025, 10), "-1025")); // Because why not? :D
        // borders
        System.out.println(assertEquals(converter.toString(0, 19), "0"));
        System.out.println(assertEquals(converter.toString(0, -19), Converter.getErrorMessage()));
        System.out.println(assertEquals(converter.toString(Integer.MAX_VALUE, 2), Integer.toBinaryString(Integer.MAX_VALUE)));
        System.out.println(assertEquals(converter.toString(Integer.MIN_VALUE + 1, 16), "-7FFFFFFF"));
        System.out.println(assertEquals(converter.toString(Integer.MIN_VALUE + 1, Integer.MAX_VALUE), Converter.getErrorMessage()));
        System.out.println(assertEquals(converter.toString(Integer.MAX_VALUE, Integer.MIN_VALUE), Converter.getErrorMessage()));
        System.out.println(assertEquals(converter.toString(10, Integer.MAX_VALUE), Converter.getErrorMessage()));

        // toString(String, int) tests
        System.out.println(assertEquals(converter.toString("1F", 16), "31"));
        System.out.println(assertEquals(converter.toString("111111111", 2), "511"));
        System.out.println(assertEquals(converter.toString("377", 8), "255"));
        System.out.println(assertEquals(converter.toString("13", 13), "16"));

        // borders (Same trouble with MIN_VALUE)
        System.out.println(assertEquals(converter.toString("-1111111111111111111111111111111", 2), Integer.toString(Integer.MIN_VALUE + 1)));
        System.out.println(assertEquals(converter.toString(Integer.toBinaryString(Integer.MAX_VALUE), 2), Integer.toString(Integer.MAX_VALUE)));
        System.out.println(assertEquals(converter.toString("-7FFFFFFF", 16), Integer.toString(Integer.MIN_VALUE + 1)));

        // negative
        System.out.println(assertEquals(converter.toString("-FF", 16), "-255"));
        System.out.println(assertEquals(converter.toString("-F", 16), "-15"));
    }
}
