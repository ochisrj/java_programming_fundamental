// จงเขียนโปรแกรมเพื่อตรวจข้อสอบนักเรียนจำนวน n คน แต่ละคนทำข้อสอบ 10 ข้อๆ ละ 1 คะแนน 

// โดยกำหนดให้เฉลยข้อสอบข้อแรกถึงข้อสุดท้ายเป็นดังนี้ 1 2 3 4 1 2 3 4 1 2 

// เมื่อตรวจข้อสอบเสร็จแล้วให้แสดงคะแนนที่นักเรียนแต่ละคนทำได้ทางหน้าจอ ตามลำดับ

// Testset
// Example 1:
// Input:
// 3
// 1 2 3 1 1 3 4 1 2 3 
// 2 2 1 2 3 4 1 3 3 1 
// 1 3 2 1 2 2 4 1 2 1

// Output:
// 4
// 1
// 2

package Lab6;
import java.util.Scanner;

public class Test18 {

    /** Answer key for the 10-question exam */
    static final int[] ANSWER_KEY = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};

    /**
     * Method checkScore compares a student's answers against the answer key
     * @param answers an int array of the student's 10 answers
     * @return total score as int (number of correct answers)
     */
    public static int checkScore(int[] answers) {
        int score = 0;
        for (int i = 0; i < ANSWER_KEY.length; i++) {
            if (answers[i] == ANSWER_KEY[i]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for (int i = 0; i < n; i++) {
            int[] answers = new int[10];
            for (int j = 0; j < 10; j++) {
                answers[j] = lsa.nextInt();
            }
            System.out.println(checkScore(answers));
        }

        lsa.close();
    }
}
