package Lab6.sheetlab;

public class Test02 {
    public static void main(String[] args) {
        // 1. กำหนดอาเรย์ list พร้อมค่าเริ่มต้น 10 ตัว
        int[] list = { 2, 45, 24, 29, 90, -2, 59, 45, 23, 89 };
        
        // 2. กำหนดค่าเริ่มต้นของ max, min ให้เท่ากับสมาชิกตัวแรกของอาเรย์ (list[0])
        int max = list[0];
        int min = list[0];
        
        // 3. กำหนดตัวแปรสำหรับเก็บผลรวมทั้งหมด
        int sum = 0;

        // 4. วนลูปอ่านสมาชิกทุกตัวในอาเรย์ list
        for(int i = 0 ; i < list.length; i++)
        {
            // 4.1 ตรวจสอบหาค่าน้อยที่สุด หากพบค่าที่น้อยกว่า min ให้เปลี่ยนค่า min เป็นค่านั้น
            if(list[i] < min)
            {
                min = list[i];
            }
            
            // 4.2 ตรวจสอบหาค่ามากที่สุด หากพบค่าที่มากกว่า max ให้เปลี่ยนค่า max เป็นค่านั้น
            if(list[i] > max)
            {
                max = list[i];
            }
            
            // 4.3 บวกสะสมค่าสมาชิกแต่ละตัวเข้าตัวแปร sum
            sum += list[i];
        }

        // 5. คำนวณค่าเฉลี่ย โดยแปลง sum เป็น double ก่อนหารด้วยจำนวนสมาชิก (list.length)
        double average = (double) sum / list.length;
        
        // 6. แสดงผลลัพธ์ทั้งหมดออกทางหน้าจอ
        System.out.println("list = { 2, 45, 24, 29, 90, -2, 59, 45, 23, 89 }");
        System.out.println("Average : " + average);
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
}