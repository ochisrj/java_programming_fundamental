package Lab5;

import java.util.Scanner;

public class Test09_lottery {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int target = 25;
        int guess = 0;
        int count = 0;

        while (guess != target) {
            guess = lsa.nextInt();
            count++;
            
            if (guess == target) {
                System.out.println("yes " + count);
            } 
            else {
                System.out.println("no");
            }
        }
        
    }
}
