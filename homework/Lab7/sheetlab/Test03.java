package Lab7.sheetlab;

import java.util.Scanner;
/**
 * คลาสสำหรับตรวจสอบความยาวของข้อความอินพุต และนับจำนวนเลขหนึ่ง ('1') ที่ปรากฏในข้อความ 
 * โดยมีการจำกัดความยาวของข้อความให้อยู่ในช่วงที่กำหนด
 * @author kittipoom samranjai
 */
public class Test03 {
    /**
     * เมธอดหลัก (Entry Point) ทำหน้าที่รับข้อความอินพุตจากผู้ใช้ผ่านคอนโซล
     * วนลูปตรวจสอบความยาวของข้อความ และนับจำนวนอักขระที่เป็นเลข '1' พร้อมแสดงผลลัพธ์
     * 
     * @param args อาร์กิวเมนต์แบบอาร์เรย์ของ String ที่ส่งเข้ามาตอนรันโปรแกรมผ่าน Command Line (ไม่ได้ใช้งานในโค้ดนี้)
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        String input = lsa.next();
        int count = 0;
        // วนลูปตรวจสอบอักขระทีละตัวในสตริงตามความยาวของอินพุต
        for(int i = 0; i < input.length(); i++)
        {
            // ตรวจสอบเงื่อนไขหากข้อความยาวเกิน 5 ตัวอักษร
            if(input.length() > 5)
            {
                System.out.println("Too Long");
                break;
            }
            // ตรวจสอบเงื่อนไขหากข้อความสั้นกว่า 2 ตัวอักษร
            else if(input.length() < 3)
            {
                System.out.println("Too Short");
                break;
            }
            // หากความยาวถูกต้อง ให้ตรวจสอบว่าอักขระในตำแหน่งนั้นเป็นเลข '1' หรือไม่
            else if(input.charAt(i) == '1')
            {
                count++; // เพิ่มตัวนับเมื่อเจอเลข '1'
            }
        }
        switch (count) {
            case 0:
                break;
            default:
                // แสดงผลรวมจำนวนเลข '1' ที่ตรวจพบทั้งหมด
                System.out.println(count);
        }
        // ปิดการใช้งาน Scanner เพื่อคืนทรัพยากรให้กับระบบ
        lsa.close();
    }
}
