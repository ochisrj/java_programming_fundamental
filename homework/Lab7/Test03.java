// สมมุติว่า DNA ของกระต่ายประกอบด้วยรหัสพันธุกรรม A กับ B จงเขียนโปรแกรมเพื่อช่วยตัดสินว่า กระต่ายน้อยสามตัวนี้ เป็นพี่น้องกันหรือเป็นญาติหรือไม่ 

// - กระต่ายจะเป็นพี่น้องกัน ก็ต่อเมื่อมีความยาว DNA เท่ากัน และ ตำแหน่งแรกของรหัสพันธุกรรมต้องเป็นตัวอักษร ตัวเดียวกัน

// - กระต่ายจะเป็นญาติกัน ก็ต่อเมื่อมีความยาว DNA เท่ากัน แต่ตำแหน่งแรกของรหัสพันธุกรรมเป็นตัวอักษรคนละตัวกัน

// เขียนโปรแกรมเพื่อรับ DNA ของกระต่าย 3 ตัว

// - ถ้ากระต่ายทั้ง 3 ตัวนี้เป็นพี่น้องกัน ให้พิมพ์ว่า YES

// - ถ้ามีกระต่ายอย่างน้อยคู่หนึ่งที่เป็นญาติกัน ให้พิมพ์ว่า Relatives

// - ส่วนกรณีอื่นๆ ให้พิมพ์ว่า NO 

// Testset
// Example 1:
// Input:
// AABBABAAAAAB 
// AABBABA 
// BAAABBAABB

// Output:
// NO

package Lab7;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // รับข้อมูล DNA ของกระต่ายทั้ง 3 ตัว
        String dna1 = scanner.next();
        String dna2 = scanner.next();
        String dna3 = scanner.next();

        // ตรวจสอบเงื่อนไข "เป็นพี่น้องกันทั้งหมด"
        // เงื่อนไข: ทั้ง 3 ตัวความยาวเท่ากันหมด และตัวแรกเหมือนกันหมด
        boolean allBrothers = (dna1.length() == dna2.length() && dna2.length() == dna3.length()) &&
                             (dna1.charAt(0) == dna2.charAt(0) && dna2.charAt(0) == dna3.charAt(0));

        if (allBrothers) {
            System.out.println("YES");
        } else {
            // ตรวจสอบเงื่อนไข "มีอย่างน้อยคู่หนึ่งที่เป็นญาติกัน"
            // เงื่อนไขญาติ: ความยาวเท่ากัน แต่ตัวแรกไม่เหมือนกัน
            
            // คู่ที่ 1: ตัวที่ 1 กับ ตัวที่ 2
            boolean rel12 = (dna1.length() == dna2.length()) && (dna1.charAt(0) != dna2.charAt(0));
            
            // คู่ที่ 2: ตัวที่ 2 กับ ตัวที่ 3
            boolean rel23 = (dna2.length() == dna3.length()) && (dna2.charAt(0) != dna3.charAt(0));
            
            // คู่ที่ 3: ตัวที่ 1 กับ ตัวที่ 3
            boolean rel13 = (dna1.length() == dna3.length()) && (dna1.charAt(0) != dna3.charAt(0));

            if (rel12 || rel23 || rel13) {
                System.out.println("Relatives");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
    
}
