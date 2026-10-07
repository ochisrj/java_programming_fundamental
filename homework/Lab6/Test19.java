// จงเขียนโปรแกรมรับตัวเลขจำนวนเต็มสองจำนวน (m และ n) แทนขนาดรูปภาพจากนั้นให้รับรายละเอียดของรูปภาพที่ประกอบไปด้วยตัวอักษรขนาด m x n ตัว (รูปภาพประกอบด้วยตัวอักขระ # และ $) แล้วทำการตรวจสอบว่ารูปที่รับเข้ามามีตัวอักขระ $ เกินครึ่งหนึ่งหรือไม่

//  - ถ้าเกินครึ่งให้เซ็นเซอร์รูปด้วยการพิมพ์ทับบรรทัดที่เป็นเลขคู่และคอลัมน์ที่เป็นเลขคี่ของรูปนั้นด้วยเครื่องหมาย x ตัวพิมพ์เล็ก

//  - ถ้าไม่เกินให้พิมพ์กรอบรูปให้กับรูปภาพที่รับเข้ามา โดยพิมทับข้อมูลบรรทัดแรก บรรทัดสุดท้าย คอลัมน์แรก และคอลัมน์สุดท้าย เปิดกรอบรูปใช้สัญลักษณ์ +

// Testset
// Example 1:
// Input:
// 3 4 
// # # $ #
// # # # $
// # # $ #

// Output:
// + + + + 
// + # # + 
// + + + + 
package Lab6;
import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        java.util.ArrayList<Character> pixels = new java.util.ArrayList<>();
        while (scanner.hasNext() && pixels.size() < m * n) {
            String token = scanner.next();
            for (int k = 0; k < token.length(); k++) {
                char c = token.charAt(k);
                if (c == '#' || c == '$') {
                    pixels.add(c);
                    if (pixels.size() >= m * n) break;
                }
            }
        }

        char[][] image = new char[m][n];
        int dollarCount = 0;
        int p = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = p < pixels.size() ? pixels.get(p++) : '#';
                // นับจำนวนตัวอักขระ $
                if (image[i][j] == '$') {
                    dollarCount++;
                }
            }
        }

        int totalPixels = m * n;
        boolean isOverHalf = dollarCount > (totalPixels / 2.0);

        if (isOverHalf) {
            // เซ็นเซอร์: แถวเลขคู่ (นับจาก 0) ทับทั้งแถว + คอลัมน์เลขคี่ (นับจาก 0) ในแถวที่เหลือ
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0 || j % 2 == 1) {
                        System.out.print("x ");
                    } else {
                        System.out.print(image[i][j] + " ");
                    }
                }
                System.out.println();
            }
        } else {
            // เงื่อนไขที่ 2: ไม่เกินครึ่ง -> พิมพ์กรอบรูปด้วย '+' ที่ขอบทั้ง 4 ด้าน
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        System.out.print("+ ");
                    } else {
                        System.out.print(image[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
