package Lab6.sheetlab3;

import java.util.Scanner;

public class Test03 
{
    // สร้างเมธอดสำหรับสมการกำลังสอง
    public static void solveQuadratic(double a, double b, double c)
    {
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // ตรวจสอบว่าค่าไม่ติดลบ
        if (discriminant >= 0) {
            // แก้ไขการใส่วงเล็บให้ถูกต้องตามลำดับความสำคัญคณิตศาสตร์
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // แสดงผลทศนิยม 6 ตำแหน่ง
            System.out.printf("X = %.6f\n", x1);
            System.out.printf("X = %.6f\n", x2);
        } else {
            System.out.println("No real roots");
        }
    }

    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        System.out.println("Program for solve quadratic equations");    
        System.out.println("ax^2 + bx + c = 0");    
        System.out.println("====================================");

        System.out.print("Input a : "); // รับค่า a
        double a = lsa.nextDouble(); 
        System.out.print("Input b : "); // รับค่า b
        double b = lsa.nextDouble();
        System.out.print("Input c : "); // รับค่า c
        double c = lsa.nextDouble();

        System.out.println("====================================");
        System.out.println("Processing result");
        System.out.println("====================================");

        // เรียกใช้ฟังก์ชัน
        solveQuadratic(a, b, c);

        lsa.close();
    }    
}
