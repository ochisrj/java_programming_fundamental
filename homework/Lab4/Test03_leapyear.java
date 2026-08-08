package Lab4;

import java.util.Scanner;

public class Test03_leapyear {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int year;
        year = lsa.nextInt();
        if (year % 4 != 0)
        {
            System.out.println("common year");
        }
        else if(year % 100 != 0)
        {
            System.out.println("leap year");
        }
        else if(year % 400 != 0)
        {
            System.out.println("common year");
        }
        else
        {
            System.out.println("leap year");
        }

        lsa.close();
    }
    
}
