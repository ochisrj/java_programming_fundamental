package Lab6.sheetlab;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        
        // 1. รับค่าจำนวนสมาชิกในอาเรย์ (n)
        System.out.print("Input index : ");
        int n = lsa.nextInt();
        
        // 2. ประกาศและสร้างอาเรย์ขนาด n ช่อง พร้อมสร้างตัวแปรเก็บเลขเป้าหมาย
        int[] Nrange = new int[n];
        int target = 0;
        
        // 3. วนลูปเพื่อรับค่าตัวเลขเก็บลงในอาเรย์ตามขนาด n
        for(int i = 0 ; i < n ; i++)
        {
            Nrange[i] = lsa.nextInt();
        }
        
        // 4. รับค่าตัวเลขเป้าหมาย (target) ที่ต้องการค้นหา
        System.out.print("Target number : ");
        target = lsa.nextInt();
        
        // 5. กำหนดค่าเริ่มต้นของตำแหน่ง (index) เป็น -1 (เผื่อในกรณีที่ไม่เจอเลขเป้าหมาย)
        int ind = -1;
        
        // 6. วนลูปค้นหาเลขเป้าหมายในอาเรย์ หากเจอให้เก็บตำแหน่ง index นั้นไว้
        for(int i = 0 ; i < n ; i++)
        {
            // 7. ถ้า loop i ใน Nrange มีค่าเท่ากับ target
            if(Nrange[i] == target)
            {
                ind = i;
            }
        }
        
        // 8. แสดงผลตำแหน่ง index ที่พบ (ถ้าไม่เจอจะแสดง -1)
        System.out.println(ind);
        
        lsa.close();
    }
}