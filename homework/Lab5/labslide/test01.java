package Lab5.labslide;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n  = lsa.nextInt();

        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
