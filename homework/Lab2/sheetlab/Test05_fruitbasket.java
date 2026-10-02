package Lab2.sheetlab;
import java.util.Scanner;

public class Test05_fruitbasket {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
        int  fruit , basket , remain;
        System.out.print("Input amount fruit : ");  
        fruit = kd.nextInt();
        basket = (int)fruit / 6;
        remain = (int)fruit % 6;    
        System.out.print("=== Calculate amount of fruit ===\n");
        System.out.printf("Basket : " + basket + "\n");
        System.out.printf("Remain fruit : " +  remain);
        kd.close();
    }
}
