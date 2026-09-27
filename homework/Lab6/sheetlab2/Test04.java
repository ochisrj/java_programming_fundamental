package Lab6.sheetlab2;

public class Test04 {
    public static void main(String[] args) {
        // Array 2 มิติ ขนาด 4x4
        int[][] arr = { 
            {4, 6, 4, 9}, 
            {5, 3, 2, 0}, 
            {6, 5, 0, 12}, 
            {3, 1, 9, 8} 
        };

        int colum = arr[0].length;      // จำนวนคอลัมน์ทั้งหมด
        int grandTotal = 0;             // ตัวแปรเก็บผลรวมสมาชิกทั้งหมดในตาราง
        int[] sumcol = new int[colum];  // Array สำหรับเก็บผลรวมแยกตามคอลัมน์ (ความยาวเท่ากับจำนวนคอลัมน์)
        
        System.out.print("\t");
        // วนลูปพิมพ์ชื่อคอลัมน์: col1, col2, col3, ...
        for (int c = 1; c <= colum; c++) 
        {
            System.out.printf("col%-3d\t", c);
        }      
        System.out.print("Total"); // หัวข้อผลรวมประจำแถวที่ฝั่งขวา
        System.out.println();

        for(int i = 0; i < arr.length; i++)
        {   
            // แสดงป้ายชื่อแถว (Row Label)
            if(i < 2)
            {
                System.out.print("row" + (i + 1) + "\t"); // แถวที่ 1-2 ใช้ "row" ตัวเล็ก
            } 
            else 
            {
                System.out.print("Row" + (i + 1) + "\t"); // แถวที่ 3 เป็นต้นไปใช้ "Row" ตัวใหญ่
            }
            int sumrow = 0;// ตัวแปรเก็บผลรวมประจำแถวปัจจุบัน

            // วนลูปอ่านสมาชิกแต่ละคอลัมน์ในแถวปัจจุบัน
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
                sumrow += arr[i][j];    // สะสมค่าเข้าผลรวมประจำแถว
                sumcol[j] += arr[i][j]; // สะสมค่าลงใน Array ผลรวมประจำคอลัมน์ที่ j
            }
            grandTotal += sumrow;       // รวมผลรวมประจำแถวเข้าสู่ผลรวมทั้งหมด (Grand Total)
            System.out.println(sumrow); // พิมพ์ผลรวมประจำแถวไว้ท้ายสุดของแถวนั้น
        }

        // พิมพ์แถวสรุปผลรวมคอลัมน์และผลรวมทั้งหมด (Footer)
        System.out.print("Total\t");
        
        for(int j = 0; j < colum; j++) // พิมพ์ผลรวมของแต่ละคอลัมน์ที่สะสมไว้ใน sumcol
        {
            System.out.print(sumcol[j] + "\t");
        }
        System.out.println(grandTotal); // พิมพ์ผลรวมทั้งหมด (Grand Total) ที่มุมขวาล่างสุด
    }
}