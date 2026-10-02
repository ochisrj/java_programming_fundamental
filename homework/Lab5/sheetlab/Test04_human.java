package Lab5.sheetlab;

import java.util.Scanner;

public class Test04_human {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input amount of person (N) : ");
        int amount = lsa.nextInt();

        double max = -1;
        double min = 9999;
        double sum = 0;

        for(int i = 1; i <= amount ; i++){
            System.out.printf("Input weight of person[%d] : " , i);
            int weights = lsa.nextInt();
            sum += weights;
            if(weights > max){
                max = weights;
            }
            if(weights < min){
                min = weights;
            }
        }
        double avg = sum / amount;

        System.out.println("=== Processing ===");
        System.out.println("Max weight : " + max);
        System.out.println("Min weight : " + min);
        System.out.printf("Average weight : %.2f" , avg);

        lsa.close();
    }
}
