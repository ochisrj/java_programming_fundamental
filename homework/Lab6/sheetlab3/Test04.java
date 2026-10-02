package Lab6.sheetlab3;

import java.util.Scanner;

public class Test04 {
    // กำหนดค่าคงที่สากลสำหรับค่า Pi
    public static double PI = 3.14159;

    // เมธอดคำนวณเส้นรอบวงของวงกลมจากรัศมีที่กำหนด
    public static double circumference(double R) {
        return 2 * PI * R;
    }

    // เมธอดคำนวณพื้นที่ของวงกลมจากรัศมีที่กำหนด
    public static double area(double R) {
        return PI * (R * R);
    }

    public static void main(String[] args) {
        // สร้างออบเจกต์ Scanner เพื่ออ่านข้อมูลจากผู้ใช้ทางคอนโซล
        Scanner lsa = new Scanner(System.in);
        
        // แจ้งให้ผู้ใช้ป้อนค่ารัศมีหน่วยเซนติเมตร
        System.out.print("Input Radius (centi): ");
        double R = lsa.nextDouble();
        
        // คำนวณเส้นรอบวงและเก็บไว้ในตัวแปร 'Radius'
        double Radius = circumference(R);
        
        // คำนวณพื้นที่และเก็บไว้ในตัวแปร 'Area'
        double Area = area(R);
        
        // พิมพ์ผลลัพธ์โดยจัดรูปแบบทศนิยม 2 ตำแหน่ง
        System.out.printf("The lenght of circle : %.2f Centimeter\n" , Radius);
        System.out.printf("The area of circle : %.2f Centimeter " , Area);
        
        // ปิดออบเจกต์ scanner เพื่อป้องกันหน่วยความจำรั่ว
        lsa.close();
    }
}
