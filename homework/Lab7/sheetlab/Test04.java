package Lab7.sheetlab;

import java.util.Scanner;

/**
 * คลาสสำหรับนับจำนวนตัวอักษรเฉพาะกลุ่ม ได้แก่ 'R', 'G' และ 'P' จากข้อความที่ป้อนเข้ามา
 * และแสดงผลลัพธ์การนับสรุปผลในบรรทัดเดียว เช่น 2R1G3P
 * 
 * @author kittipoom samranjai
 * @version 1.0
 */
public class Test04 {

    /**
     * เมธอดหลัก (Entry Point) ทำหน้าที่รับข้อความหนึ่งบรรทัดจากคอนโซล
     * แปลงเป็นตัวพิมพ์ใหญ่ แล้วทำการวนลูปตรวจนับตัวอักษร R, G, P ก่อนพิมพ์ผลลัพธ์
     * 
     * @param args อาร์กิวเมนต์แบบอาร์เรย์ของ String ที่ส่งเข้ามาตอนรันโปรแกรมผ่าน Command Line (ไม่ได้ใช้งานในโค้ดนี้)
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int countR = 0; // ตัวนับสำหรับอักขระ 'R'
        int countG = 0; // ตัวนับสำหรับอักขระ 'G'
        int countP = 0; // ตัวนับสำหรับอักขระ 'P'

        // รับข้อความทั้งบรรทัดและแปลงเป็นตัวพิมพ์ใหญ่ทั้งหมดเพื่อสอดคล้องกับการเช็กเงื่อนไข
        String input = lsa.nextLine().toUpperCase();
        
        // วนลูปตรวจสอบอักขระทีละตัวตั้งแต่ต้นจนจบสตริง
        for(int i = 0; i < input.length() ;i++)
        {
            // ตรวจสอบว่าอักขระปัจจุบันคือ 'R', 'G' หรือ 'P' หรือไม่ หากใช่ให้เพิ่มค่าตัวนับนั้นๆ
            if(input.charAt(i) == 'R')
            { 
                countR++;
            }
            else if(input.charAt(i) == 'G')
            {
                countG++;
            }
            else if(input.charAt(i) == 'P')
            {
                countP++;
            }
        }
        
        // แสดงผลสรุปจำนวนตัวอักษรที่นับได้ในรูปแบบรหัส (เช่น 1R2G0P)
        System.out.println(countR + "R" + countG + "G" + countP + "P");
        
        // ปิดการใช้งาน Scanner เพื่อคืนทรัพยากรให้กับระบบ
        lsa.close();
    }
}
