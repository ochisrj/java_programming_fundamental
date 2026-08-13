package Lab5;

import java.util.Scanner;

public class Test01_mutitable {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int number = lsa.nextInt();
        for(int i = 1 ; i <= 12 ; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        lsa.close();
    }
}
