package learning.JavaFile;

public class Chapter02_variable {
    public static void main(String[] args) {

        byte a = 127; // 1 byte = 127 , -128
        short b = 32767; // 2 bytes = 32767 , -32768
        int c = 2147483647; // 4 bytes = 2147483647 , 2147483648
        float e = 3.4028235E38f; // 4 bytes 1.4E-45 , 3.4028235E38 และต้องมี > f < ต่อท้าย
        double f = 5.25E36; // 8 bytes 4.9E-324 , 1.7976931348623157E308
        long d = 9223372036854775807l; // 8 bytes 9223372036854775807 , 9223372036854775808 และต้องมี > l < ต่อท้าย
        char g = 'A'; // 2 bytes เป็นข้อมูลอักขระเก็บได้เพียง 1 ตัวอักษร Unicode Character
        String h = "Hello World"; // 3 bytes / 1 ตัวอักษร เป็นข้อมูลอักขระเก็บได้หลายตัวอักษร Unicode Character
        boolean i = true; // 1 bit true , false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        System.out.println(2 + 2);
        System.out.println(2.0 + 2.0);

        System.out.println(3 - 2);
        System.out.println(2 - 3);
        System.out.println(3.0 - 2.0);
        System.out.println(2.0 - 3.0);

        System.out.println(2 * 2);
        System.out.println(2.0 * 2.0);

        System.out.println(3 / 2);
        System.out.println(2 / 3);
        System.out.println(3.0 / 2.0);
        System.out.println(2.0 / 3.0);

    }
    
}
