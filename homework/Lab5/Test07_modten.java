package Lab5;

import java.util.Scanner;

public class Test07_modten {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        for(int i = a ;i >= 0 ; i--){
            if(i % 10 == 0){
                System.out.print(i + " ");
            }
        }


        lsa.close();
    }
}
