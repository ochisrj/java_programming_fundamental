package Lab6.sheetlab2;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) 
    {
        // รับค่าข้อมูล Matrix ขนาด 3x3 จากผู้ใช้งาน (User Input)
        Scanner lsa = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter elements for a 3x3 matrix: ");
        for (int i = 0; i < 3; i++) // วนลูปรับค่าตัวเลขเก็บลงใน Matrix ทีละตำแหน่ง (Row-by-Row)
        {
            for (int j = 0; j < 3; j++) 
            {
                matrix[i][j] = lsa.nextInt();
            }
        }

        // ตรวจสอบคุณสมบัติ Symmetric Matrix (matrix[i][j] == matrix[j][i])
        boolean isSymmetric = true;
        for (int i = 0; i < 3; i++) // วนลูปเปรียบเทียบค่าตำแหน่งตรงข้ามแนวเส้นทแยงมุม i j 
            {
            for (int j = 0; j < 3; j++) // วนลูป j
            {
                if (matrix[i][j] != matrix[j][i]) // หากพบตำแหน่งที่ค่าสลับแถว-คอลัมน์ ไม่เท่ากัน แสดงว่าไม่ใช่ Symmetric Matrix
                {
                    isSymmetric = false; // เปลี่ยนสถานะเป็น false
                    break;
                }
            }

            // หากพบว่าไม่ใช่ Symmetric Matrix ตั้งแต่ลูปด้านใน ให้หยุดลูปแถว (ลูปนอก) ด้วย
            if (!isSymmetric) 
            {
                break;
            }
        }
        // แสดงผลการตรวจสอบ และคืนทรัพยากร Scanner
        if (isSymmetric) 
        {
            System.out.println("The matrix is a symmetric matrix.");
        } 
        else 
        {
            System.out.println("The matrix is NOT a symmetric matrix.");
        }

        lsa.close();    
    }
}
