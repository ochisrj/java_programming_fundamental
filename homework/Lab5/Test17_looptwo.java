package Lab5;

import java.util.Scanner;

public class Test17_looptwo {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int j = 0 ; j <= n; j++ )
        {
            System.out.print(" ");
        }
        System.out.println("|");

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 0 ; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.print(" | ");
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
