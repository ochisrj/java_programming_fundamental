package Lab7.sheetlab;

import java.util.Scanner;

/**
 * คลาสสำหรับรับค่าข้อความจากผู้ใช้ผ่านคอนโซลเพื่อแปลงเป็นตัวพิมพ์ใหญ่ 
 * และนับจำนวนสระภาษาอังกฤษ (a, e, i, o, u) ที่ป้อนเข้ามา
 * โปรแกรมจะทำงานไปเรื่อย ๆ จนกว่าผู้ใช้จะพิมพ์ตัวอักษร "q"
 * 
 * @author kittipoom samranjai
 */
public class Test01 {

    /**
     * เมธอดหลัก (Entry Point) ของโปรแกรม ทำหน้าที่รันลูปรับค่าจากสแกนเนอร์
     * แปลงข้อความเป็นตัวพิมพ์ใหญ่ นับสระ และหยุดการทำงานเมื่อเจอคำสั่งจบโปรแกรม
     * 
     * @param args อาร์กิวเมนต์แบบอาร์เรย์ของ String ที่ส่งเข้ามาตอนรันโปรแกรมผ่าน Command Line (ไม่ได้ใช้งานในโค้ดนี้)
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int count = 0;
        
        // ลูปทำงานตลอดเวลาจนกว่าจะเจอเงื่อนไข break
        while (true) 
        {
            // รับข้อความถัดไปจากผู้ใช้
            String input = lsa.next(); 
            
            // แสดงผลข้อความที่รับมาในรูปแบบตัวพิมพ์ใหญ่ทั้งหมด
            System.out.println(input.toUpperCase()); 
            
            // ตรวจสอบตัวอักษรเพื่อทำการนับสระภาษาอังกฤษ
            switch (input) { 
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    count++; // เพิ่มตัวนับหากตรงกับสระตัวใดตัวหนึ่งข้างต้น
            }
            
            // หากผู้ใช้พิมพ์ "q" ให้หลุดออกจากลูปเพื่อจบการทำงาน
            if(input.equals("q")){ 
                break;
            }
        }
        
        // แสดงจำนวนสระทั้งหมดที่ตรวจพบในลูป
        System.out.println(count); 

        // ปิดการใช้งาน Scanner เพื่อคืนทรัพยากรให้กับระบบ
        lsa.close();
    }
}
