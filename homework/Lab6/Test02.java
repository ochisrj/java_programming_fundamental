// พนักงานคนหนึ่งกำลังยื่นบัตรคิวเข้าคอนเสิร์ตให้กับผู้มาชมคอนเสิร์ตจำนวน n คน ซึ่งบัตรคิวมีหลายรูปแบบ หลังจากพนักงานยื่นบัตรไปแล้ว เกิดอยากทราบว่ามีคนที่ได้บัตรหมายเลข x รูปแบบเดียวกันจำนวนกี่คน

// จงเขียนโปรแกรมรับจำนวนผู้มาชมคอนเสิร์ต (n) และหมายเลขบัตรคิวของ n คนนั้น และหมายเลขบัตรที่พนักงานต้องการทราบ (x) จากนั้นให้ทำการนับว่า ในบรรดาผู้มาชมคอนเสิร์ตทั้งหมดมีคนได้บัตรหมายเลข x กี่คน

// Testset
// Example 1:
// Input:
// 6
// 10 10 30 33 10 25
// 10

// Output:
// 3

package Lab6;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        int x = lsa.nextInt();
        int[] n = new int[x];
        int target = 0;

        for(int i = 0; i < x ; i++)
        {
            n[i] = lsa.nextInt();
        }   
        target = lsa.nextInt();

        int count = 0;
        for(int i = 0; i < x; i++)
        {
            if(n[i] == target)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
