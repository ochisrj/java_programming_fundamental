// ที่โรงเรียนกระต่าย มีตึกเรียนอยู่ 3 ตึก คือ Science Building (SC), Informatics Building (IF) และ Engineering Building (EN) แต่ละตึกมีไม่เกิน 9 ชั้น และแต่ละชั้นมไม่เกิน 99 ห้อง

// รูปแบบการเขียนตัวยอของชื่อห้องที่โรงเรียนกระต่ายแห่งนี้จะขึ้นต้น ด้วยตัวอักษรย่อของชื่อตึก เป็นตัวพิมพ์ใหญ่ 2 ตัวอักษร แล้วตามด้วยหมายเลขชั้น (ตัวเลข 1 ตัว) และหมายเลขห้อง (ตัวเลข 2 ตัว) เช่น SC514 หมายถึง ตึก Science Building ชั้น 5 ห้อง 14 

// ให้นิสิตเขียนโปรแกรมบอกชื่อตึก ชั้น และ ห้อง ให้น้องกระต่ายน้อยที่เป็นนักเรียนใหม่ของที่นี่ โดยแสดงผลลัพธ์ ดังนี้ 

// บรรทัดแรกเป็นชื่อตึก 

// บรรทัดที่สอง พิมพ์คำว่า Floor เว้นวรรค แล้วตามด้วยหมายเลขชั้น

// บรรทัดที่สาม พิมพ์คําวา Room เว้นวรรค แล้วตามด้วยหมายเลขห้อง

// กําหนดให้ SC คือ Science Building, IF คือ Informatics Building และ EN คือ Engineering Building 

// Testset
// Example 1:
// Input:
// SC514

// Output:
// Science Building
// Floor 5
// Room 14

package Lab7;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        String input = lsa.next();
        char[] Building = input.toCharArray(); // from input translate string to Array

        // Check array 0 - 1 is that 2 array is true for propose
        if(Building[0] == 'S' && Building[1] == 'C')
        {
            System.out.println("Science Building");
        }
        else if(Building[0] == 'I' && Building[1] == 'F')
        {
            System.out.println("Informatics Building ");
        }
        else if(Building[0] == 'E' && Building[1] == 'N')
        {
            System.out.println("Engineering Building");
        }
        else
        {
            System.out.println("Wrong Building or Invalid number");
        }

        System.out.println("Floor " + Building[2]); // output floor array at index 2
        System.out.println("Room " + Building[3] + Building[4]); // output room array at index 3 to 4
        lsa.close();
    }
}
