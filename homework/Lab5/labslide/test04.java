package Lab5.labslide;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();  
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j >= 1)
                {
                    System.out.print(i +" ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
