package Lab5;

import java.util.Scanner;

public class Test14_son2 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        int n = lsa.nextInt();

        for (int i = 1 ; i <= m ; i++){
            for (int j = 1 ; j <= n ; j++){
                for (int k = 1 ; k <= n ; k++){
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
