package Lab2;

import java.util.Scanner;

public class Test01_feetinch {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("รับค่า (feet) : ");
        int feet = lsa.nextInt();

        System.out.println(feet * 12);
        lsa.close();
    }
    
}
