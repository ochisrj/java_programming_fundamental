package Array1D;
import java.util.Scanner;

public class kee6 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int[] num = {95, 1, 6, 34, 5, 9, 123, -2, 57, 82, 12, 79, 45, 34, 1};
        int[] upper = new int[num.length];
        int[] lower = new int[num.length];
        int numUpper = 0, numLower = 0;

        int x = 6;
        for(int i = 0; i < num.length ;i++)
        {
            if(num[i] > x)
            {   
                upper[numUpper] = num[i];
                numUpper++;
            }
            else
            {
                lower[numLower] = num[i];
                numLower++;
            }
        }

        System.out.println("Upper Array");
        for(int i = 0 ; i < numUpper ;i++)
        {
            System.out.print(upper[i] + " ");
        }
        System.out.println();
        
        System.out.println("Lower Array");
        for(int i = 0 ; i < numLower ;i++)
        {
            System.out.print(lower[i] + " ");
        }
    }
}
