package Lab5.sheetlab3;

import java.util.Scanner;

public class Test05_job {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1; j <= i ; j++)
            {
                if(j == i || j == 1 || i == n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");    
                }
            }
            System.out.println();
        }
        lsa.close();
    }
}
