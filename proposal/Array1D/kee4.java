package Array1D;
import java.util.Scanner;

public class kee4 {
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 10, 2, 8, 3, 2, 1, 1, 8, 5, 10, 11, 7, 6, 10};
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input number : ");
        int x = lsa.nextInt();

        // find x in array
        boolean isFound = false;
        for(int i = 0 ; i < num.length ; i++)
        {
            if(num[i] == x)
            {
                System.out.println("Found " + x + " at position " + i);
                isFound = true;
            }
        }

        if(!isFound)
        {   
            System.out.println("-1");
        }
    }
}
