package Lab5;

import java.util.Scanner;

public class Test20_diamond {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = n - i ; j >= 1 ; j--)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i = n - 1 ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
