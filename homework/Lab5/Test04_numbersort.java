    package Lab5;

    import java.util.Scanner;

    public class Test04_numbersort {
        public static void main(String[] args) {
            Scanner lsa = new Scanner(System.in);
            int a = lsa.nextInt();
            int b = lsa.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }

            lsa.close();
        }   
    }