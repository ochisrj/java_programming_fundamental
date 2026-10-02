package Lab4.SheetLab;

import java.util.Scanner;

public class Test04_sport {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input temperature : ");
        int temperature = lsa.nextInt();
        System.out.print("Input weather : ");
        char weather = lsa.next().charAt(0);

        String[] sport = {
            "Badminton" , // 0
            "Yoga" , // 1
            "Football" , // 2
            "Swim" // 3
        };

        switch (weather) {
            case 'R':
            case 'r':
                if(temperature <= 30)
                {
                    System.out.printf("Suggest sport : %s" , sport[0]);
                }
                else if(temperature > 30)
                {
                    System.out.printf("Suggest sport : %s", sport[1]);
                }
                break;
            case 'S':
            case 's':
                if(temperature <= 30)
                {
                    System.out.printf("Suggest sport : %s" , sport[2]);
                }
                else if(temperature > 30)
                {
                    System.out.printf("Suggest sport : %s", sport[3]);
                }                
            default:
                break;
        }
        lsa.close();
    }
}
