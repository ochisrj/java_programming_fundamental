package Lab5.sheetlab3;

import java.util.Scanner;

public class Test03_ad {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = n - i + 1; j <= n; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        lsa.close();
    }    
}

