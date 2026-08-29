package Lab5;
import java.util.Scanner;

public class Test15_pusa {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if (j < i) {
                    System.out.print("=");
                } 
                else if (j >= (2 * n - 1) - i) {
                    System.out.print("=");
                } 
                else {
                    System.out.print("+");
                }
            }            
            System.out.println(); 
        }

        lsa.close();
    }
}