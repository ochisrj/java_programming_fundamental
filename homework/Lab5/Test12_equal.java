package Lab5;

import java.util.Scanner;

public class Test12_equal {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        for(int i = 1 ; i <= n ; i++){
            if(i == 1 || i == n){
                for(int j = 1 ; j <= n ; j++){
                    System.out.print(i);
                }
            }
            else {
                System.out.print(i);
                for(int j = 1 ; j <= n - 2 ; j++){
                    System.out.print("=");
                }
                System.out.print(i);
            }
        System.out.println();
        }   



        lsa.close();
    }
}
