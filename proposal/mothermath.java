import java.util.Scanner;

public class mothermath {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("");
        int number = lsa.nextInt();
        for (int i = 1; i <= 12;i++){
            System.out.println(number + " x " + i + " = " + (number * i));
            }
        lsa.close();
    }
}
