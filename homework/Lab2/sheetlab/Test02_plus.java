package Lab2.sheetlab;
import java.util.Scanner;

public class Test02_plus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("" + (a + b));
        System.out.println("" + (a * b));
        scan.close();
    }
}       

