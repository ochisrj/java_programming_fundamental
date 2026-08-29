package Lab5.sheetlab2;

import java.util.Scanner;

public class Test05_ {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        int n = lsa.nextInt();
        int o = lsa.nextInt();

        for(int i = 1 ; i <= m ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                for(int k = 1 ; k <= o ; k++)
                {
                    System.out.print("*");
                }
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        lsa.close();
    }
}
