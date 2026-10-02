package Lab4;
import java.util.Scanner;

public class Test01_calculator {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int num1 , num2 , result;
        
        System.out.print("");
        num1 = lsa.nextInt();
        num2 = lsa.nextInt();
        result = lsa.next().charAt(0);
        switch (result) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Error");
                break;
        }
        lsa.close();
     
    }
}
