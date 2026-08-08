package Lab4;

import java.util.Scanner;

public class Test02_waterstatus {
    public static void main(String[] args) {
        int num; 
        char t_status;
        Scanner lsa = new Scanner(System.in); 
        System.out.print("");
        System.out.print("");
        num = lsa.nextInt();
        t_status = lsa.next().charAt(0);
        
        if(t_status == 'f' || t_status == 'F')
        {
            if(num <= 32)
            {
                System.out.println("Solid");
            }
            else if(num >= 212)
            {
                System.out.println("Gas");
            }
            else if(num >= 33 && num <= 211)
            {
                System.out.println("Liquid");
            }
        }
        if(t_status == 'c' || t_status == 'C')
        {
            if(num <= 0)
            {
                System.out.println("Solid");
            }
            else if(num >= 100)
            {
                System.out.println("Gas");
            }
            else if(num >= 1 && num <= 211 )
            {
                System.out.println("Liquid");
            }
        }

        lsa.close();

    }
    
}
