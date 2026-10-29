/**
 * @author kittipoom samranjai
 * @version 0.1
 */

package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class testscore {
    public static void main(String[] args) throws FileNotFoundException {
        // ดึง Path ไฟล์เดิมของคุณมาใช้สำหรับอ่านข้อมูล
        Scanner inFile = new Scanner(new File("C:\\Users\\ochig\\Project\\Pytohn Java Course\\Java Course\\Programming_fundimental\\StudentScore.txt"));
        
        // เพิ่ม PrintWriter เพื่อบันทึกผลลงไฟล์ StudentGrade.txt ในโฟลเดอร์เดียวกัน
        PrintWriter outFile = new PrintWriter(new File("C:\\Users\\ochig\\Project\\Pytohn Java Course\\Java Course\\Programming_fundimental\\StudentGrade.txt"));

        while (inFile.hasNext()) { // ในไฟล์ให้อ่านข้อมูลตัวถัดไป
            String id = inFile.next(); 
            String name = inFile.next();
            String lastname = inFile.next();
            
            int hw = inFile.nextInt();
            int midterm = inFile.nextInt();
            int fin = inFile.nextInt();

            int sum = hw + midterm + fin; // นำตัวแปรที่อ่านมา มาร่วมกันในตัวแปร sum
            String grade;

            // ตรวจสอบคะแนนที่มาจากตัวแปร sum และแทนเกรดใน grade
            if (sum >= 80) {
                grade = "A";
            } else if (sum >= 75) {
                grade = "B+";
            } else if (sum >= 70) {
                grade = "B";
            } else if (sum >= 65) {
                grade = "C+";
            } else if (sum >= 60) {
                grade = "C";
            } else if (sum >= 55) {
                grade = "D+";
            } else if (sum >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("ID: " + id + " Sum: " + sum + " Grade: " + grade);

            outFile.println(id + " " + grade); // ในไฟล์ปริ้นแค่ id และ grade
        }

        inFile.close();
        outFile.close();
        
    }
}
