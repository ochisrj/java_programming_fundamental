package Lab6.sheetlab3;

import java.util.Scanner;

public class Test02 
{
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input Point 1 (x and y) : "); // รับข้อมูลจุดที่ 1
        int Xsec1 = lsa.nextInt();
        int Ysec1 = lsa.nextInt();
        System.out.print("Input Point 2 (x and y) : "); // รับข้อมูลจุดที่ 2
        int Xsec2 = lsa.nextInt();
        int Ysec2 = lsa.nextInt();

        // หาระยะทางโดยใช้สูตร
        double distance = Math.sqrt(Math.pow(Xsec2 - Xsec1,2) + Math.pow(Ysec2 - Ysec1,2));

        // แสดงค่าตัวแปรระยะทาง
        System.out.printf("Distance = %d" ,(long) distance);
        lsa.close();
    }
}