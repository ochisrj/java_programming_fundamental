package Lab6.sheetlab;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner lsa = new  Scanner(System.in);
        // 1. รับค่า n จาก keyboard
        int n = lsa.nextInt();

        // 2. ประกาศตัวแปร score เพื่อทำการเก็บค่า Array
        int[] scores = new int[n];

        // 3. วนลูปรับคะแนนของนักเรียนแต่ละคนมาเก็บไว้ในอาร์เรย์
        for (int i = 0; i < n; i++) {
            scores[i] = lsa.nextInt();
        }

        // 4. พิมพ์คะแนนย้อนกลับจากคนสุดท้ายไปยังคนแรก
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
        lsa.close();
    }
}
