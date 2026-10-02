package Lab6.sheetlab;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 1. สร้างตัวแปร Scanner เพื่อรับข้อมูลจากคีย์บอร์ด
        Scanner lsa = new Scanner(System.in);
        
        // 2. รับค่าจำนวนคน (n) ที่ต้องการป้อนข้อมูลน้ำหนัก
        int n = lsa.nextInt();
        
        // 3. ประกาศและสร้างอาเรย์เก็บน้ำหนักชนิด double ขนาด n ช่อง พร้อมตัวแปรเก็บผลรวมน้ำหนัก (sum)
        double[] weight = new double[n];
        double sum = 0;
        
        // 4. วนลูปรับค่าน้ำหนักของแต่ละคน (person 1 ถึง n)
        for(int i = 0 ; i < n ; i++)
        {
            // 4.1 แสดงข้อความรับค่า (ใช้ i + 1 เพื่อแสดงลำดับคนเริ่มที่ 1)
            System.out.print("person " + (i + 1) + " : ");
            
            // 4.2 รับค่าน้ำหนักเก็บในอาเรย์ตำแหน่งที่ i
            weight[i] = lsa.nextDouble();
            
            // 4.3 บวกสะสมน้ำหนักเข้าตัวแปร sum
            sum += weight[i];
        }
        
        // 5. คำนวณค่าน้ำหนักเฉลี่ย (เอาผลรวมทั้งหมดหารด้วยจำนวนคน)
        double average = sum / n;
        
        // 6. ประกาศตัวแปรนับจำนวนคนที่มีน้ำหนักเกินค่าเฉลี่ย
        int count = 0;

        // 7. วนลูปตรวจสอบน้ำหนักของแต่ละคนในอาเรย์
        for (int i = 0; i < n ; i++) 
        {
            // 7.1 ถ้าค่าน้ำหนักตำแหน่งที่ i มากกว่าค่าเฉลี่ย ให้บวกตัวนับเพิ่ม 1
            if (weight[i] > average) 
            {
                count++;
            }
        }
        
        // 8. แสดงผลลัพธ์การคำนวณ ค่าเฉลี่ย และจำนวนคนที่มีน้ำหนักเกินค่าเฉลี่ย
        System.out.println("--- calculate ---");
        System.out.println("Average : " + average);
        System.out.println("The person that are over average : " + count + " person");
        
        // 9. ปิด Scanner เพื่อคืนทรัพยากรระบบ
        lsa.close();
    }
}