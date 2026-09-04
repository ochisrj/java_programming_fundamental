package Lab5;

import java.util.Scanner;

public class Test16_loop
{
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for (int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}