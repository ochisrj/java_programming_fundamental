package Lab6.sheetlab3;

import java.util.Scanner;

public class Test05 
{
    // สร้างเมธอดตรวจสอบสระสำหรับตัวอักษร
    public static boolean isVowel(char ch)
    {
        switch (ch) { // ตรวจสอบกรณี A E I O U
            case 'A': case 'a':
            case 'E': case 'e':
            case 'I': case 'i':
            case 'O': case 'o':
            case 'U': case 'u':
                return true; // ส่งค่าตัวแปรบูลีนกลับ (เป็นสระ)
            default:
                return false; // ส่งค่าตัวแปรบูลีนกลับ (ไม่ใช่สระ)
        }
    }
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input your character : ");
        char alphaB = lsa.next().charAt(0); // รับข้อมูลตัวอักษรเดี่ยว
        if(isVowel(alphaB)) // เรียกใช้เมธอดจาก alphaB
        {
            System.out.println("Vowel"); // พิมพ์ว่าเป็นสระ
        }
        else 
        {
            System.out.println("Not Vowel"); // ถ้าไม่ใช่ ให้พิมพ์ว่าไม่ใช่สระ
        }
        lsa.close();
    }
}
