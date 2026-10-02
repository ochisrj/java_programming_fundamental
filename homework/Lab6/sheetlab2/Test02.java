package Lab6.sheetlab2;

public class Test02 {
    public static void main(String[] args) {
        // ประกาศกำหนดค่าให้ array 2 มิติ ขนาด 4x3
        int[][] matrixA = { 
            { 1, 2, 3, 4}, 
            { 5, 6, 7, 8}, 
          	{ 9, 0, 1 ,2} 
        };

        System.out.println("\t=====  Matrix A ====="); // แสดงข้อความ matrix a
        for(int i = 0; i < matrixA.length; i++) // วนลูปทีละแถว (Row-by-Row) 
        {
            System.out.print("|\t");
            for(int j = 0; j < matrixA[i].length; j++) // วนลูปพิมพ์ค่าในแต่ละคอลัมน์ของแถวนั้นๆ
            {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println("|\t");
        }
        // ค้นหาและแสดงผลค่าต่ำสุด (Min) ของแต่ละคอลัมน์
        System.out.print("Min\t");
        for(int j = 0 ; j < matrixA[0].length; j++) // วนลูปตามแนวยาวทีละคอลัมน์ (Column-by-Column)
        {   // สมมติให้ค่าในแถวแรก (Row 0) ของคอลัมน์ j เป็นค่า Min เริ่มต้น
            int min = matrixA[0][j];

            // วนลูปเปรียบเทียบกับสมาชิกในแถวถัดๆ ไป (Row 1 ถึงสุดท้าย) ในคอลัมน์เดิม
            for(int i = 1 ; i < matrixA.length; i++)
            {
                if(matrixA[i][j] < min)
                {
                    min = matrixA[i][j]; // อัปเดตค่า Min ใหม่เมื่อพบตัวเลขที่น้อยกว่า
                }
            }
            
            // พิมพ์ค่า Min ของคอลัมน์ j
            System.out.print(min + "\t");
        }
        
    }
}
