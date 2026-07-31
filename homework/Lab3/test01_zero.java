package Lab3;

import java.util.Scanner;

public class test01_zero {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int a;
        System.out.print("");
        a = lc.nextInt();
        if(a > 0)
        {
            System.out.println("your number more than zero");
        }
        else if(a <= 0)
        {
            System.out.println("your number less or equal zero");
        }
        else
        {
           
        }
        lc.close();
    }

}
