package Lab6.sheetlab;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int[] n = new int[10];

        //1. รับค่าเลขจำนวนเต็ม 10 จำนวน
        for (int i = 0; i < 10; i++) 
        {
            n[i] = lsa.nextInt();
        }

        //2. แสดงตัวเลขที่เก็บอยู่ใน index ที่เป็นเลขคู่ (0, 2, 4, 6, 8)
        System.out.print("Value in even index :");
        for (int i = 0; i < 10; i += 2) 
        {
            System.out.print(" " + n[i]);
        }
        System.out.println();

        //3. แสดงเลขคู่ทั้งหมดในอาร์เรย์ (ค่าที่เป็นเลขคู่)
        System.out.print("Even number :");
        for (int i = 0; i < 10; i++) 
        {
            if (n[i] % 2 == 0) 
            {
                System.out.print(" " + n[i]);
            }
        }
        
        System.out.println();
    }
}
