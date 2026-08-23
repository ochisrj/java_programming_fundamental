package Lab5.sheetlab;

import java.util.Scanner;

public class Test02_twonum {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input number 1 and number 2 : ");
        int[] number = new int[2];
        number[0] = lsa.nextInt();
        number[1] = lsa.nextInt();

        if(number[0] >number[1]){
            int avf = number[0];
            number[0] = number[1];
            number[1] = avf;
        }

        for(int i = number[0]; i <= number[1] ; i++){
            if(i % 3 == 0){
                System.out.print("* ");
            }
            System.out.print(i + " ");
        }
        lsa.close();
    }
}
