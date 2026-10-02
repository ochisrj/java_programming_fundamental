package Array1D;
import java.util.Scanner;

public class kee2 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();
        double[] a = new double[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = lsa.nextDouble();
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
