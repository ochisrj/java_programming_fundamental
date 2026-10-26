
import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int input = lsa.nextInt();
        int res = 1;
        for(int i = 1; i < input; i++)
        {
            res = input * i;
        }
        System.out.println(res);
    }
}