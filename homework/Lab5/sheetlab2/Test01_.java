package Lab5.sheetlab2;

import java.util.Scanner;

public class Test01_ {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();
        
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        
        for(int j = 0 ; j < n - 2 ; j++)
        {
            System.out.print("*");
        }
        System.out.println();
        
        for(int k = 0 ; k < n - 4 ; k++)
        {
            System.out.print("*");
        }

        lsa.close();
    }
}

