// จงเขียนเมธอด double average(int[] arr) เพื่อใช้ในการค่าเฉลี่ยของตัวแปรอาร์เรย์ทั้งหมด

// และเมธอด void printOnlyGreaterValue(int[] arr, double value) สำหรับพิมพ์เฉพาะค่าของอาร์เรย์ที่มีค่ามากกว่า value 

// จากนั้นเขียนโปรแกรมหลัก โดยรับตัวเลขเต็ม (n) 1 จำนวน หลังจากนั้นวนรับค่าตัวเลขจำนวนเต็มในตัวแปรอาร์เรย์

// แล้วเรียกใช้เมธอด average เพื่อหาค่าเฉลี่ย และทำการพิมพ์ค่าจากอาร์เรย์เฉพาะค่าที่มีค่ามากกว่าค่าเฉลี่ยด้วยเมธอด printOnlyGreaterValue

// Testset
// Example 1:
// Input:
// 5
// 1 2 3 4 5

// Output:
// 4 5 

/**
 * @author Kittipoom Samranjai
 * @Student-ID 69160134
 * @param Test16 main program
 */

package Lab6;
import java.util.Scanner;

public class Test16 {
    /**
     * Method average store arr int variable
     * @param arr a int array
     * @param sum find all number
     * @return sum / arr lenght
     */
    public static double average(int[] arr)
    {
        if(arr.length == 0)
        {
            return 0;
        }
        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }

        return (double) sum / arr.length;
    }
    /**
     * Method printOnlyGreatValue print only array value that more than value
     * @param arr number
     * @param value 
     */
    public static void printOnlyGreaterValue(int[] arr,double value)
    {
        for(int num : arr) // create var in for loop to arr
        {
            if(num > value) 
            {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt(); // call lsa for input
        int[] num = new int[n]; // create new array from n variable

        for(int i = 0; i < n; i++)
        {
            num[i] = lsa.nextInt(); // loop input array
        }

        double avg = average(num); // call method average for num
        printOnlyGreaterValue(num, avg); // display method for num and average

        lsa.close();
    }
}
