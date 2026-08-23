package Lab5.sheetlab;

import java.util.Scanner;

public class Test05_dot {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input : ");
        int number = lsa.nextInt();
        System.out.print("Output : " + number + " ");
        for(int i = 1 ; i <= number ; i++){
            System.out.print("*");
            if (number <= 0){}
        }
        lsa.close();
    }
}
