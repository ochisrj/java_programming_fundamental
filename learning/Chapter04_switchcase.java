package learning;

import java.util.Scanner;

public class Chapter04_switchcase {
    public static void main(String[] args) {
        
        // switch case
        int gas = 5; // ค่า gas มีค่าเป็น 5
        switch (gas) {
            case 1: // หากเคสเป็น 1 ให้ break
                break;
            case 4:
                break;
            default: // หากไม่ใช่ทั้งหมด ก็ default 
                break;
        }

        // input (รับค่า char)
        char grade;
        int score;
        Scanner lsa = new Scanner(System.in);
        System.out.print("input : ");
        grade = lsa.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'a': // สามารถสร้างเคสที่ 2 ได้ เพื่อแยกชนิด ตัวอักษร ตัวเลข และอื่นๆ
                System.out.println("Your point is 4");
                break;
            case 'B':
            case 'ิ':
                System.out.println("Your point is 3");
                break;
            case 'C':
            case 'c':
                System.out.println("Your point is 2");
                break;
            case 'D':
            case 'd':
                System.out.println("Your point is 1");
                break;
            default:
                System.out.println("Error");
                break;
        }

        // การเลือกทำโดยใช้ ?: เป็นการกำหนดโดยไม่ต้องใช้คำสั่ง
        System.out.print("Score :");
        score = lsa.nextInt();
        grade = (score > 60)? 'P':'F'; // ใช้ได้เพียงสองครั้งเท่านั้น
        grade = (score > 90)? 'A':((score > 70)? 'C':'F'); // การใช้ซ้อน 
        System.out.println("grade : " + grade);

        lsa.close();

        
    }
    
}
