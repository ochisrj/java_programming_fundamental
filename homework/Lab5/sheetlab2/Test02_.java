package Lab5.sheetlab2;

import java.util.Scanner;

public class Test02_ {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        int n = lsa.nextInt();

        for(int r = 1 ; r <= m ; r++)
        {
            for(int c = 1 ; c <= n ; c++)
            {
                System.out.print(r + " ");
            }
            System.out.println();
        }

    }
}
