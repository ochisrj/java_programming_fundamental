package Lab3;

import java.util.Scanner;

public class Test02_romancov
{
    public static void main(String[] args) 
    {
        Scanner ad = new Scanner(System.in);
        int num;
        System.out.println("=== Program convert arabic to roman ===");
        System.out.print("Input : ");
        num = ad.nextInt();
        if(num == 1)
        {
            System.out.println("I");
        }
        else if(num == 2)
        {
            System.out.println("II");
        }
        else if(num == 3)
        {
            System.out.println("III");
        }
        else if(num == 4)
        {
            System.out.println("IV");
        }
        else if(num == 5)
        {
            System.out.println("V");
        }
        else if(num == 6)
        {
            System.out.println("VI");
        }
        else if(num == 7)
        {
            System.out.println("VII");
        }
        else if(num == 8)
        {
            System.out.println("VIII");
        }
        else if(num == 9)
        {
            System.out.println("IX");
        }
        else if(num == 10)
        {
            System.out.println("X");
        }
        else
        {
        }
        ad.close();
    }
}
