package Test;

import java.util.Scanner;

public class quiz8 {
    public static void main(String[] args){
        Scanner lsa = new Scanner(System.in);
        int salary = lsa.nextInt();
        int age = lsa.nextInt();
        boolean hascredit = lsa.nextBoolean();

        if (age < 20 || age > 60) {
            System.out.println("Rejected : age limite");
        }

        if(salary >= 30000 && hascredit){
            System.out.println("Approve");
        }
        else if(salary >= 50000 && !hascredit){
            System.out.println("Conditional Approve");
        }
        else {
            System.out.println("Reject : low credit");
        }

    }
}
