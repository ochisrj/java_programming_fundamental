package Test;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter parking minutes: ");
        int minutes = sc.nextInt();
        
        if (minutes <= 30) {
            System.out.println("Parking Fee: 0 THB");
        } else {
            int hours = (int) Math.ceil(minutes / 60.0);
            int fee = 0;
            
            if (hours <= 2) {
                fee = hours * 20;
            } else {
                fee = (2 * 20) + ((hours - 2) * 50);
            }
            
            System.out.println("Parking Fee: " + fee + " THB");
        }
        
        sc.close();
    }
}