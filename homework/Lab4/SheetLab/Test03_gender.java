package Lab4.SheetLab;
import java.util.Scanner;

public class Test03_gender {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input sex : ");
        char gender = lsa.next().charAt(0);
        System.out.print("Input age : ");
        int age = lsa.nextInt();

        System.out.println("=== Processing ===");

        switch (gender) {
            case 'M':
            case 'm':
                if( age > 0 && age <= 15)
                {
                    System.out.println("Your are a boy");
                }
                else if(age > 15)
                {
                    System.out.println("Your are a man");
                }
                else if(age < 0)
                {
                    System.out.println("Dont know, what you are");
                }
                break;
            case 'F':
            case 'f':
                if( age > 0 && age <= 15)
                {
                    System.out.println("Your are a girl");
                }
                else if(age > 15)
                {
                    System.out.println("Your are a woman");
                }
                else if(age < 0)
                {
                    System.out.println("Dont know, what you are");
                }

                break;
            default:
                if(gender != 'f' || gender != 'F' && gender != 'm' || gender != 'M')
                {
                    System.out.println("Dont know, what you are");
                }
                break;
        }

        lsa.close();
    }
}
