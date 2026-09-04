package Lab5.sheetlab3;

import java.util.Scanner;

public class Test02_ffa {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print("-");

            }
            for(int k = 1 ; k <= i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        lsa.close();
    }
}
