package Lab4.SheetLab;

import java.util.Scanner;
public class Test01_vowel {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        char rub;
        System.out.print("");
        rub = lsa.next().charAt(0);
        switch (rub) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;	
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("No Vowel");
        }

        lsa.close();
    }

}
