// START

//     METHOD int count(int[] arr, int item)
//         int c = 0
//         FOR Each element IN arr DO
//             IF element == item THEN
//                 c = c + 1
//         RETURN c
//     END METHOD

//     MAIN
//         int[] list = {5, 2, 5, 4, 5, 6, 5, 9, 10, 4}
//         INPUT target as int
//         OUTPUT "\nthe target number have : " + count(list,target)
//     END MAIN

// END



package Lab6.sheetlab4;

import java.util.Scanner;

public class Test03 {
    /**
     * count method use for check target number in array
     * @param arr variable array
     * @param item the target number
     * @return counter to store value
     */
    public static int count(int[] arr, int item)
    {   
        int counter = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == item)
            {
                counter++;
            }
        }
        return counter;
    }
    /**
     * Main Program
     * @param main
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        // create list to store array
        int[] list = {5,2,5,4,5,6,5,9,10,4};
        for(int n : list) // find length of list in n
        {
            System.out.print(n + " "); // print out number in list
        }
        System.out.print("\nyour target number array : ");
        int target = lsa.nextInt(); // input number you want to find
        System.out.println("the target number have : " + count(list,target)); // call method and display
    }
}
