// จงเขียนโปรแกรมเพื่อรับขนาดของอาร์เรย์ 2 มิติ คือ (m และ n) ต่อด้วยการรับค่าของสมาชิก แต่ละตัว

// หลังจากนั้น นับตัวเลข 2 ตัวแทนพิกัด (x,y) เพื่อแสดงผลตามเงื่อนไขต่อไปนี้

// ถ้าข้อมูลด้านบนและด้านล่างของค่าข้อมูลในพิกัด (x,y) เป็นเลข 1 ทั้งคู่ให้แสดง true
// ถ้าข้อมูลด้านซ้ายและด้านขวาของค่าค่าข้อมูลในพิกัด (x,y) เป็นเลข 1 ทั้งคู่ให้แสดง true
// ถ้าเป็นกรณีอื่น ให้แสดง flase
// หมายเหตุ : เริ่มนับสมาชิกตัวแรกของอาร์เรย์อยู่ในพิกัด 0 0

// Testset
// Example 1:
// Input:
// 3 10  
// 0 0 0 0 0 0 0 1 1 1 
// 0 0 0 0 0 1 0 1 0 1 
// 1 0 1 0 0 0 0 1 1 1 
// 1 6

package Lab6;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt(); 
        int n = lsa.nextInt();
        
        boolean topcheck = false;
        boolean leftcheck = false;
        
        int[][] Range = new int[m][n];
        for(int i = 0 ; i < m; i++)
        {   
            for(int j = 0; j < n; j++)
            {
                Range[i][j] = lsa.nextInt();       
            }
        }

        int x = lsa.nextInt();
        int y = lsa.nextInt();
        
        if(x - 1 >= 0 && x + 1 < m)
        {
            if(Range[x - 1][y] == 1 && Range[x + 1][y] == 1)
            {
                topcheck = true;
            }
        }
        if (y - 1 >= 0 && y + 1 < n) {
            if (Range[x][y - 1] == 1 && Range[x][y + 1] == 1) {
                leftcheck = true;
            }
        }

        if(topcheck || leftcheck)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
    }
}
