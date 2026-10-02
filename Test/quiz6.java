package Test;

import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        int b = lsa.nextInt();

        for(int i = a ; i <= b ; i++){
            System.out.print(i + " ");
        }

    }
}
