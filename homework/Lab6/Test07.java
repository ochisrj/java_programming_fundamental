// จงเขียนโปรแกรมรับข้อมูลจัดเก็บในอาร์เรย์ขนาด 3 x 3 ซึ่งข้อมูลที่จัดเก็บอยู่ในอาร์เรย์นั้นมีเพียง 0 กับ 1

// จากนั้นให้ทำการตรวจสอบว่าแถวหรือคอลัมน์ใดที่มีตัวเลขเหมือนกันทั้งหมด พร้อมทั้งระบุเบอร์ว่าตัวเลขที่เหมือนกันนั้นคือตัวเลขใด

// หมายเหตุ : หากมีหลายแถวหลายคอลัมน์ที่มีตัวเลขเหมือนกันทั้งหมด ให้จัดลำดับการแสดงผลดังนี้

// เริ่มแสดงผลจากแถวก่อนตามลำดับ (แกวที่ 0-2) แล้วตามด้วยคอลัมน์ตามลำดับ (คอลัมน์ 0-2)

// Testset
// Example 1:
// Input:
// 0 0 0
// 0 0 0
// 1 1 1

// Output:
// All 0 on row 0
// All 0 on row 1
// All 1 on row 2

package Lab6;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args)
    {
        Scanner lsa = new Scanner(System.in);

        int[][] sum = new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                sum[i][j] = lsa.nextInt();
            }
        }
        lsa.close();

        for(int i = 0; i < 3; i++)
        {
            if(sum[i][0] == sum[i][1] && sum[i][1] == sum[i][2])
            {
                System.out.println("All " + sum[i][0] + " on row " + i);
            }
        }

        for(int j = 0; j < 3; j++)
        {
            if(sum[0][j] == sum[1][j] && sum[1][j] == sum[2][j])
            {
                System.out.println("All " + sum[0][j] + " on column " + j);
            }
        }
    }
}
