package Lab5;

import java.util.Scanner;

public class Test06_oddnum {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        int b = lsa.nextInt();
        int sum = 0;
        for(int i = a ; i <= b ; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n"+sum);
        lsa.close();
    }
}
