// ข้อความธีออสเป็นการถอดรหัสข้อความที่ประกอบด้วยอักขระ A-Z โดยจะรวมตัวอักขระที่ติดกันให้เป็นจํานวนก่อน เช่น AAAAA สามารถทําเป็นข้อความธีออสได้ว่า 5A หรือ ABBCD สามารถทําเป็นข้อความธีออสได้ว่า 1A2B1C1D จงเขียน โปรแกรมเพื่อถอดรหัสข้อความออกมาเป็นข้อความธีออส

// กําหนดให้ ข้อความที่รับเข้ามาประกอบด้วย A-Z ที่มีความยาว 5 ตัวอักษรเสมอ 

// Testset
// Example 1:
// Input:
// AAAAA

// Output:
// 5A

package Lab7;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        String text = lsa.nextLine().toUpperCase();
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < text.length(); i++) {
            // ถ้าเป็นตัวสุดท้าย หรือ ตัวถัดไปไม่เหมือนกับตัวปัจจุบัน
            if (i == text.length() - 1 || text.charAt(i) != text.charAt(i + 1)) {
                result.append(count).append(text.charAt(i));
                count = 1; //รีเซ็ตตัวนับ
            } else {
                count++; // ถ้าตัวถัดไปเหมือนกัน ให้เพิ่มจำนวนนับ
            }
        }
        
        System.out.println(result.toString());
    }
    
}
