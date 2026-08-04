package Lab4.SheetLab;

import java.util.Scanner;

public class Test02_roman {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);

        System.out.println("=== Program convert arabic to roman ===");
        System.out.print("input : ");
        int num = lsa.nextInt();

        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("VI");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;

            default:
                System.out.println("Cant not convert to roman number, My program support only 1-10");
                break;
        }
        lsa.close();
    }
}
