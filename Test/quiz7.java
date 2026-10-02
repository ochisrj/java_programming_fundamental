package Test;

import java.util.Scanner;

public class quiz7 {
    public static void main(String[] args){
        Scanner lsa = new Scanner(System.in);
        int year = lsa.nextInt();
        if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.println("is Leap Year");
        }
    }
}
