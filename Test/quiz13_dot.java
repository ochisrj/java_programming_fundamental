package Test;

import java.util.Scanner;

public class quiz13_dot {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        for(int i = 1 ; i <= m ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
        }
    }
}
