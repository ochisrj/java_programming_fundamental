package Test;

import java.util.Scanner;

public class quiz12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in) ;
        int N , i ;
        N = kb.nextInt();
        i = 1 ;
        while ( i <= N) {
            if (i%3 == 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");

            }
            i++ ;
        }
    }
}
