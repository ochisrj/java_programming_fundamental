package Lab1;
import java.util.Scanner;

public class Test02_rectanglecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        int area = width * height;
        int perimeter = 2 * (width + height);
        
        System.out.println(area);
        System.out.println(perimeter);
        
        scanner.close();
    }
}