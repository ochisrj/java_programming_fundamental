// รหัสพันธุกรรมของกระต่ายน้อยมีความยาว 3 ตัวอักษรเสมอ ซึ่งตัวอักษรที่เป็นไปได้ที่จะปรากฏในสายพันธุกรรม คือ A B C หรือ D รหัสพันธุกรรมแต่ละตัวอักษร กระต่ายน้อยอาจได้รับมาจาก พ่อ หรือ แม่ โดยอาจมีเพียงตําแหนงเดียวเท่านั้นที่จะแตกต่างจากทั้งพ่อและแม่ได้

// ให้นิสิตเขียนโปรแกรมเพื่อรับรหัสพันธุกรรม 3 สาย คือ รหัสพันธุกรรมของ พ่อ แม่ และ กระต่ายน้อย ตามลําดับ จากนั้น ให้ตรวจสอบว่า กระต่ายน้อยเป็นลูกของพ่อ และ แม่ จริงหรือไม่ 

// ผลลัพธ์ประกอบด้วย 2 บรรทัด บรรทัดแรกให้พิจารณาโดยใช้เกณฑ์ดังนี้ 

// - ถ้ารหัสพันธุกรรมในตําแหน่งใด ๆ ของกระต่ายน้อยได้มาจากพ่อ ให้แสดงผลเป็นตัว F แต่ถ้าได้มาจากแม่ให้

// แสดงผลเป็น M (ในกรณีที่รหัสพันธุกรรมที่ตําแหน่งนั้นของพ่อและแม่เหมือนกัน ให้แสดงผลเป็น F) 

// - ถ้ารหัสพันธุกรรมที่ตําแหน่งนั้นไม่ตรงกับทั้งของพ่อและแม่เลย ให้แสดงผลเป็น X

// บรรทัดสอง ให้แสดง YES ถ้าผลการตรวจสอบสายพันธุกรรมมีตำแหน่งของ X ไม่เกิน 1 ตําแหน่ง ไม่เช่นนั้นให้แสดงผล

// เป็น NO

// Testset
// Example 1:
// Input:
// AAB 
// BCA 
// ACC

// Output:
// FMX
// YES

package Lab7;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        String Dad = lsa.next().toUpperCase();
        String Mom = lsa.next().toUpperCase();
        String Kid = lsa.next().toUpperCase();

        String Store = "";
        int CountX = 0;
        
        for(int i = 0; i <= 2;i++)
        {
            if(Dad.charAt(i) == Kid.charAt(i))
            {
                Store += "F";
            }
            else if(Mom.charAt(i) == Kid.charAt(i))
            {
                Store += "M";
            }
            else{
                Store += "X";
                CountX++;
            }
        }
        System.out.println(Store);
        if(CountX > 1)
        {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }    
}
