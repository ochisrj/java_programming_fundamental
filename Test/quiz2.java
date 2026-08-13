// โรงภาพยนตร์ราคาปกติ 200.0 บาท รับค่า age (int) และ isWednesday (boolean) เพื่อคำนวณส่วนลด:

// อายุต่ำกว่า 12 หรือตั้งแต่ 60 ขึ้นไป ลด 50% (เหลือ 100.0)
// หากไม่อยู่ในเงื่อนไขแรก แต่มาชมวันพุธ ลด 20% (เหลือ 160.0)
// กรณีอื่นๆ จ่ายราคาเต็ม 200.0
// Output Format: Final Price: [price] THB

package Test;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int age = lsa.nextInt();
        int prize = 200;
        int sale = 0;
        
        if(age < 12 && 60 > age){
            sale = prize * 50 / 100;
            System.out.println((prize - sale) + " baht");
        }
        else 
        lsa.close();
    }
}
