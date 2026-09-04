package Lab5.labslide;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for (int i = n ; i  <= n ; i++)
        {
            for (int j = 1 ; j >= i ; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
