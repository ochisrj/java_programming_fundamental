package Lab5;

import java.util.Scanner;

public class Test11_doloop {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        int n = lsa.nextInt();
        int center = n / 2;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j < center){
                    System.out.print(">");
                }
                else {
                    System.out.print("<");
                }
            }
            System.out.println();
        }
        lsa.close();
    }
}
