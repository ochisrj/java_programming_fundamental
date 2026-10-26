package Lab7.sheetlab;

import java.util.Scanner;
/**
 * คลาสสำหรับแปลงรหัสไพ่ (Card Notation) เช่น "10D", "QS", "AH" ให้เป็นชื่อเต็มภาษาอังกฤษ
 * โดยแยกส่วนหน้าไพ่ (Rank) และดอกไพ่ (Suit) ออกจากกันเพื่อประมวลผล
 * และแสดงผลในรูปแบบ เช่น {@code Ace of Hearts}
 * @author kittipoom samranjai
 */
public class Test05 {
    /**
     * เมธอดหลัก (Entry Point) ทำหน้าที่รับรหัสไพ่จากคอนโซล ตรวจสอบความถูกต้องของความยาว
     * แยกส่วนรหัสหน้าไพ่และดอกไพ่ ตรวจสอบความถูกต้องของสัญลักษณ์ (Validation) 
     * แล้วแปลงและแสดงผลชื่อไพ่แบบเต็ม
     * @param args อาร์กิวเมนต์จาก Command Line
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        // รับอินพุต ตัดช่องว่างหัวท้าย และแปลงเป็นตัวพิมพ์ใหญ่ทั้งหมด
        String input = lsa.nextLine().trim().toUpperCase();
        // ปิดการใช้งาน Scanner ทันทีหลังจากรับค่าเสร็จเพื่อคืนทรัพยากรให้ระบบ
        lsa.close();

        // ตรวจสอบความยาวข้อมูลขั้นต่ำ (ต้องประกอบด้วยหน้าไพ่และดอกไพ่อย่างน้อย 2 ตัวอักษร)
        if (input.length() < 2) {
            System.out.println("Invalid input: too short");
            return; // จบการทำงานทันทีหากข้อมูลสั้นเกินไป
        }

        // แยกส่วนหน้าไพ่ (Rank) โดยตัดเอาตั้งแต่ตัวแรกจนถึงก่อนตัวสุดท้าย
        String tem = input.substring(0, input.length() - 1);
        // แยกส่วนดอกไพ่ (Suit) โดยตัดเอาเฉพาะอักษรตัวสุดท้าย
        String dok = input.substring(input.length() - 1);

        String temName = ""; // ตัวแปรเก็บชื่อเต็มของหน้าไพ่
        String dokName = ""; // ตัวแปรเก็บชื่อเต็มของดอกไพ่
        boolean isValid = true; // ตัวแปรสถานะเพื่อเช็กความถูกต้องของข้อมูลทั้งหมด

        // ตรวจสอบและแปลงรหัสหน้าไพ่ (Rank)
        switch (tem) {
            case "A":  temName = "Ace";   break;
            case "J":  temName = "Jack";  break;
            case "Q":  temName = "Queen"; break;
            case "K":  temName = "King";  break;
            case "2": case "3": case "4": case "5":
            case "6": case "7": case "8": case "9":
            case "10": temName = tem; break; // หน้าไพ่ตัวเลข 2-10 ให้ใช้ค่านั้นได้เลย
            default:
                System.out.println("Invalid rank: " + tem);
                isValid = false; // ปรับสถานะเป็น false เมื่อพบหน้าไพ่ที่ไม่ถูกต้อง
                break;
        }

        // ตรวจสอบและแปลงรหัสดอกไพ่ (Suit)
        switch (dok) {
            case "D": dokName = "Diamonds"; break;
            case "H": dokName = "Hearts";   break;
            case "S": dokName = "Spades";   break;
            case "C": dokName = "Clubs";    break;
            default:
                System.out.println("Invalid suit: " + dok);
                isValid = false; // ปรับสถานะเป็น false เมื่อพบดอกไพ่ที่ไม่ถูกต้อง
                break;
        }
        // แสดงผลลัพธ์ชื่อไพ่เต็มเฉพาะในกรณีที่ข้อมูลรหัสไพ่ถูกต้องทั้งหมดเท่านั้น
        if (isValid) {
            System.out.println(temName + " of " + dokName);
        }
    }
}
