package Lab1;

import java.util.Scanner;

public class Test01_aplusb {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("");
        System.out.print("");
        int a = lsa.nextInt();
        int b = lsa.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        lsa.close();

    }
}