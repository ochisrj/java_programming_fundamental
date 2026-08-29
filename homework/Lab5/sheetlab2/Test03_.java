package Lab5.sheetlab2;

import java.util.Scanner;

public class Test03_ {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        int n = lsa.nextInt();

        for(int i = 1 ; i <= m ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                System.out.print(i + " ");
                System.out.println(j);

            }
        }
    }
}
