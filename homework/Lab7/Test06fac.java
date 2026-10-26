package Lab7;

import java.util.Scanner;

public class Test06fac {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int num = lsa.nextInt();
        
        long factorial = 1;

        for(int i = 1; i <= num;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
 