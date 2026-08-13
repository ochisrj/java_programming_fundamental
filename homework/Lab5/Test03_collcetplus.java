package Lab5;

import java.util.Scanner;

public class Test03_collcetplus {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= 1; i++){
            sum =  a * (a + 1) / 2;
            System.out.println(sum);
        }
        lsa.close();
    }
}
