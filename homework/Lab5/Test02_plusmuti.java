package Lab5;

import java.util.Scanner;

public class Test02_plusmuti {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int num1 = lsa.nextInt();
        int num2 = lsa.nextInt();
        int sum = 0;
        for(int i = 0 ; i < num2 ; i++){
            sum += num1;
            System.out.print(num1);

            if(i < num2 - 1){
                System.out.print(" + ");
            }

        }
        System.out.println(" = " + sum);
        lsa.close();
    }
}
