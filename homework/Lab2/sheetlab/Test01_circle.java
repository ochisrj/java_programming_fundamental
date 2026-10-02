package Lab2.sheetlab;
import java.util.Scanner;

public class Test01_circle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float area,r;
        r = kb.nextFloat();
        area = 3.145f * r*r;
        System.out.println(area);
        kb.close();
    }
    
}
