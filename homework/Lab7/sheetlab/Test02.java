package Lab7.sheetlab;

import java.util.Scanner;

/**
 * คลาสสำหรับคำนวณและแปลงเกรดที่เป็นตัวอักษร (Letter Grade) เช่น A, B+, C- 
 * ให้เป็นคะแนนเฉลี่ยตัวเลข (Numeric Score) ในระบบ 4.0
 * 
 * @author kittipoom samranjai
 */
public class Test02 {

    /**
     * เมธอดหลัก (Entry Point) ทำหน้าที่รับอินพุตเกรดจากผู้ใช้ผ่านคอนโซล
     * ประมวลผลฐานคะแนนและส่วนต่างประจุ (+/-) แล้วแสดงผลลัพธ์คะแนนเฉลี่ยที่คำนวณได้
     * 
     * @param args อาร์กิวเมนต์แบบอาร์เรย์ของ String ที่ส่งเข้ามาตอนรันโปรแกรมผ่าน Command Line (ไม่ได้ใช้งานในโค้ดนี้)
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        double score = 0.0;
        
        // รับค่าเกรดจากผู้ใช้และแปลงให้เป็นตัวพิมพ์ใหญ่ทั้งหมดเพื่อป้องกันข้อผิดพลาด
        String grade = lsa.next().toUpperCase();
        
        // ขั้นตอนที่ 1: ตรวจสอบตัวอักษรตัวแรกเพื่อกำหนดฐานคะแนนเริ่มต้น
        if(grade.charAt(0) == 'A'){
            score = 4.0;
        }
        else if(grade.charAt(0) == 'B'){
            score = 3.0;
        }
        else if(grade.charAt(0) == 'C'){
            score = 2.0;
        }
        else if(grade.charAt(0) == 'D'){
            score = 1.0;
        }
        else if(grade.charAt(0) == 'F'){
            score = 0.0;
        }

        // ขั้นตอนที่ 2: ตรวจสอบว่าเกรดมีเครื่องหมายประจุเพิ่มเติม (+ หรือ -) หรือไม่ (ความยาวสตริงเท่ากับ 2)
        if(grade.length() == 2){
            if(grade.charAt(1) == '+'){
                score += 0.3; // เกรดมีเครื่องหมายบวก ให้เพิ่มคะแนนขึ้น 0.3
            }
            else if(grade.charAt(1) == '-'){
                score -= 0.3; // เกรดมีเครื่องหมายลบ ให้ลดคะแนนลง 0.3
            }
        }

        // ขั้นตอนที่ 3: ควบคุมไม่ให้คะแนนเฉลี่ยเกิน 4.0 (เช่น กรณีได้ A+ ซึ่งคำนวณได้ 4.3 จะถูกปรับลงมาเหลือ 4.0)
        if(score > 4){
            score = 4.0;
        }
        
        // แสดงผลลัพธ์คะแนนเฉลี่ยออกทางหน้าจอ
        System.out.println(score);
        
        // ปิดการใช้งาน Scanner เพื่อคืนทรัพยากรให้กับระบบ
        lsa.close();
    }
}
