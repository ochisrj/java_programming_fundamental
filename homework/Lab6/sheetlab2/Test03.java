package Lab6.sheetlab2;

public class Test03 {
    public static void main(String[] args) {
        // ประกาศ Array 2 มิติ ขนาด 3 ขนาด 3x4
        int[][] matrixA = { { 1, 2, 3, 4}, 
                            { 5, 6, 7, 8}, 
          	    	        { 9, 0, 1 ,2} };
        
        // กำหนดค่า Max เริ่มต้นด้วยตำแหน่ง matrixA[0][2] (ค่าเริ่มต้นคือ 3
        int max = matrixA[0][2];

        System.out.println("\t=====  Matrix A =====\t\t\tMax");
        // วนลูปอ่านข้อมูลทีละแถว (Row by Row)
        for(int i = 0; i < matrixA.length; i++)
        {
            System.out.print("|\t");
            // วนลูปอ่านและพิมพ์ข้อมูลในแต่ละคอลัมน์ของแถวนั้นๆ
            for(int j = 0; j < matrixA[i].length; j++)
            {
                // ตรวจสอบว่าพบสมาชิกที่มีค่ามากกว่าค่า Max ปัจจุบันหรือไม่
                if(matrixA[i][j] > max )
                {
                    max = matrixA[i][j];
                }

                // พิมพ์สมาชิกตำแหน่งปัจจุบัน
                System.out.print(matrixA[i][j] + "\t");
            }
            // ปิดท้ายแถวด้วยการพิมพ์ค่า Max สะสมที่หาได้จนถึงแถวปัจจุบัน
            System.out.println("|\t" + max);
        }

    }
}
