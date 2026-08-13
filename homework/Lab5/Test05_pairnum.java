package Lab5;

import java.util.Scanner;

public class Test05_pairnum {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        int b = lsa.nextInt();

        int start = Math.min(a , b);
        int end = Math.max(a , b);

        for(int i = start ; i <= end ; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        lsa.close();
    }
    
}
