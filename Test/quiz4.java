package Test;

import java.util.Scanner;

public class quiz4 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        double income = lsa.nextDouble();
        double tax = 0;

        if(income >= 0 && income <= 150000){
            tax = income;
        }
        else if(income >= 150001 && income <= 500000){
            tax = income * 5 / 100;
        }
        else if(income >= 500001 && income <= 1000000){
            tax = income * 10 / 100;
        }
        else if(income >= 1000001){
            tax = income * 20 / 100;
        }
        double result = income - tax;
        System.out.printf("Income : %.0f Baht | tax : %.0f Baht",result,tax);
    }
}
