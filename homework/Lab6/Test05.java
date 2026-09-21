// จงเขียนโปรแกรมรับค่าตัวเลขจำนวนเต็ม (n) แทนจำนวนนักเรียน

// หลังจากนั้นสร้างตัวแปรอาร์เรย์ 2 ตัว แต่ละตัวมีขนาด n

// โดยตัวแรกมีชนิดข้อมูลเป็น String สำหรับเก็บชื่อนักเรียน
// ส่วนอาร์เรย์ตัวที่สองมีชนิดข้อมูลเป็น int สำหรับเก็บค่าคะแนนของนักเรียน
// จากนั้นให้วนรับค่าชื่อและคะแนนของนักเรียนทั้งหมด n รอบ แล้วประมวลผลหาว่านักเรียนคนใดได้คะแนนมากที่สุดและนักเรียนคนใดได้คะแนนน้อยที่สุด

// Testset
// Example 1:
// Input:
// 5
// Jame 50
// Marry 88
// John 67
// Anna 75
// Mike 65

// Output:
// Marry
// Jame

package Lab6;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        String[] name = new String[n];
        int[] score = new int[n];

        int maxScore = 0;
        int minScore = 0;

        for(int i = 0; i < n; i++)
        {
            name[i] = lsa.next();
            score[i] = lsa.nextInt();
        }       

        for(int i = 0; i < n ; i++ )
        {
            if(score[i] > score[maxScore])
            {
                maxScore = i;
            }
            if(score[i] < score[minScore])
            {
                minScore = i;
            }
        }
        System.out.println(name[maxScore]);
        System.out.println(name[minScore]);
    }
}
