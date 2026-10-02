// จงเขียนโปรแกรมสำหรับตรวจเช็คตัวเลขว่าเป็นเลขคู่หรือเลขคี่ 

// โดยมีส่วนหัวเมธอดคือ bool is_even(int number); หากเป็นเลขคู่ให้คืนค่าจริง (true) หากเป็นเลขคี่ให้คืนค่าเท็จ (false)

// ส่วนของโปรแกรมหลักให้ทำการรับค่าตัวเลข 1 จำนวน แล้วเรียกใช้งานฟังก์ชัน is_even

// ถ้าเป็นเลขคู่ให้แสดงคำว่า even

// ถ้าเป็นเลขคี่ให้แสดงคำว่า odd

package Lab6;

import java.util.Scanner;

public class Test12 
{
    // create is_even method that store number
    static boolean is_even(int number)
    {
        // check the number if % will be zero and True.
        if(number % 2 == 0)
        {
            return true;
        }
        // if not return False
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in); // input function
        int number = lsa.nextInt(); // input number

        if(is_even(number)) // calling function is_even that check number
        {
            System.out.println("even"); // if it true print even
        }
        else
        {
            System.out.println("odd"); // if it false print odd 
        }

        lsa.close();
    }
}
