package Lab4;

import java.util.Scanner;

public class Test05_parking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int time = input.nextInt();
        double price = input.nextDouble();
        
        int hrs = (int) Math.ceil(time / 60.0);
        int freeHrs = 0;
        int pricePerHour = 0;

        if (price > 1000) {
            freeHrs = hrs;
            pricePerHour = 0;
        } else if (price >= 500) {
            freeHrs = 2;
            pricePerHour = 10;
        } else if (price > 0) {
            freeHrs = 1;
            pricePerHour = 15;
        } else {
            freeHrs = 0;
            pricePerHour = 20;
        }

        int chargeTime = hrs - freeHrs;
        if (chargeTime < 0) {
            chargeTime = 0;
        }

        int result = chargeTime * pricePerHour;
        System.out.println(result);

        input.close();
    }
}