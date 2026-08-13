import java.util.Scanner;

public class hrs {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int time = lsa.nextInt();
        int hrs = (int) Math.ceil(time / 60.0);
        System.out.println(hrs);
        lsa.close();
    }
}
