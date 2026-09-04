package Lab5.sheetlab3;

import java.util.Scanner;

public class Test04_god {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 0 ; j <= n - i ; j++)
            {
                System.out.print(i + " ");

            }
            System.out.println();       
        }
        lsa.close();
    }
}
