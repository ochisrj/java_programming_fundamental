// เขียนโปรแกรมรับข้อมูล 2 ค่าจากทางแป้นพิมพ์

// 1) ข้อความ 1 ประโยค

// 2)คํา1คํา

// ให้ทําการหาว่ามีคํากี่คําที่ปรากฏอยู่ในประโยค (ตัวพิมพ์ใหญ่และตัวพิมพ์เล็กถือว่าไม่แตกต่างกัน) แล้วแสดงผลลัพธ์ทางหน้าจอ 

// Testset
// Example 1:
// Input:
// Kin asked Kin if Kin want to eat first. Otherwise, Kin will eat First.
// Kin

// Output:
// 4

package Lab7;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        String sentense = lsa.nextLine().toUpperCase();
        String target = lsa.next().toUpperCase();
        
        String replace = sentense.replace(".", " ").replace(",", " ");
        
        int count = 0;

        for(int i = replace.indexOf(target); i != -1; i = replace.indexOf(target, i+1))
        {
            count++;
        }
        System.out.print(count);
    }
}
