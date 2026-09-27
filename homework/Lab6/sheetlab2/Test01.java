package Lab6.sheetlab2;

public class Test01 {
    public static void main(String[] args) 
    {
        // ประกาศและกำหนดค่าเริ่มต้นให้ Array 2 มิติ ขนาด 3x3
        int[][] m = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        // วนลูปอ่านข้อมูลทีละแถว (Row by Row) จากแถวบนสุดลงล่างสุด
        for(int i = 0 ; i < m.length; i++)
        {
            // วนลูปอ่านข้อมูลในแถวนั้นๆ แบบย้อนกลับ (จากคอลัมน์ขวาสุดมาซ้ายสุด)
            for(int j = m[i].length -1; j >= 0; j--)
            {
                System.out.print(m[i][j] + " ");
            }
            // ขึ้นบรรทัดใหม่หลังจากพิมพ์ข้อมูลครบทุกคอลัมน์ในแถวนั้นแล้ว
            System.out.println();
        }
    }
}
