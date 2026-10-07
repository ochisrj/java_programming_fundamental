// จงเขียนโปรแกรมสำหรับคำนวณเกรดเฉลี่ย โดยรับค่าจำนวนวิชา (n) หลังจากนั้นวนรับชื่อวิชา หน่วยกิต และเกรด หลังจากนั้นให้ทำการคำนวณหาค่าเกรดเฉลี่ยของนักเรียน โดยให้มีเมธอด calGPA(..........) สำหรับคำนวณเกรดเฉลี่ย

// Testset
// Example 1:
// Input:
// 3
// Math 3 3.5
// English 2 4
// Programming 3 4

// Output:
// 3.81

package Lab6;

/**
 * @author Kittipoom Samranjai
 * @Student-ID 69160134
 * @param GPACalculator main program
 */
import java.util.Scanner;

public class Test17 {

    /**
     * Method calGPA calculates the weighted GPA from credits and grades
     * @param credits an int array of credit hours for each subject
     * @param grades  a double array of grade points for each subject
     * @return weighted GPA as double (sum of credit*grade / total credits)
     */
    public static double calGPA(int[] credits, double[] grades) {
        double totalWeighted = 0;
        int totalCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            totalWeighted += credits[i] * grades[i]; // accumulate weighted grade
            totalCredits  += credits[i];              // accumulate total credits
        }

        if (totalCredits == 0) {
            return 0;
        }

        return totalWeighted / totalCredits;
    }

    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt(); // number of subjects
        lsa.nextLine();        // consume remaining newline

        int[]    credits = new int[n];
        double[] grades  = new double[n];

        for (int i = 0; i < n; i++) {
            String subjectName = lsa.next();         // read subject name (unused in output)
            credits[i] = lsa.nextInt();              // read credit hours
            grades[i]  = lsa.nextDouble();           // read grade point
        }

        double gpa = calGPA(credits, grades);        // call calGPA method
        System.out.printf("%.2f%n", gpa);            // print GPA rounded to 2 decimal places

        lsa.close();
    }
}