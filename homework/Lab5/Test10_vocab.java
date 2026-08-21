package Lab5;

import java.util.Scanner;

public class Test10_vocab {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        int sum = 0;
        for(int i = 0 ; i < a; i++){
            char b = lsa.next().charAt(0);
            switch (b) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                sum++;
                break;
            }
        }
        System.out.println(sum);
        lsa.close();
    }
}
