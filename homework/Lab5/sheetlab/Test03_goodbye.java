package Lab5.sheetlab;

import java.util.Scanner;

public class Test03_goodbye {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int target = -1;
        int number = 0;

        while (number != target) {
            System.out.print("Input num : ");
            number = lsa.nextInt();
            
            if(number == target){
                System.out.println("Good Bye");
                break;
            }
            System.out.println("Your type : " + number);
        }
        lsa.close();
    }
}
