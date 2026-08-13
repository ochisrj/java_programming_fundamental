package Lab1;
import java.util.Scanner;

public class Test03_reversecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        // วนลูปรับค่า 4 ครั้ง
        System.out.println("กรุณาพิมพ์ตัวเลข 4 จำนวน:");
        for (int i = 0; i < 4; i++) {
            System.out.print("ตัวที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // แสดงผลถอยหลัง (จากตัวที่พิมพ์มาล่าสุด ไปหาตัวแรก)
        System.out.println("\nแสดงผลแบบถอยหลัง:");
        for (int i = 3; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        scanner.close();
    }
}