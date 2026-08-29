package Lab5;
import java.util.Scanner;

public class Test13_son {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            if(i % 2 != 0)
            {
                for(int j = 0 ; j < n ; j++)System.out.print(">");
                System.out.print(" ");
                for(int j = 0 ; j < n ; j++)System.out.print("<");
            }
            else
            {
                for(int j = 0 ; j < n ; j++)System.out.print("<");
                System.out.print(" ");
                for(int j = 0 ; j < n ; j++)System.out.print(">");
            }
           System.out.println();
        }
    }
}
