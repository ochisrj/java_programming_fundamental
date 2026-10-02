package Lab3;

import java.util.Scanner;

public class Test03_celscov {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        double fah,cels;
        System.out.println("=== Program check weather ===");
        System.out.print("Input temperature (fahrenheit) : ");
        fah = ss.nextInt();
        cels = (fah - 32) * 5 / 9;
        if(cels < 23)
        {
            System.out.println("Weather : cold");
        }
        else if(cels >= 23 && 28 < cels)
        {
            System.out.println("Weather : cool");
        }
        else if(cels >= 28 && 33 < cels)
        {
            System.out.println("Weather : warm");
        }
        else if(cels >= 33)
        {
            System.out.println("Weather : hot");
        }
        else
        {

        }
        System.out.println("=== processing ===");
        System.out.printf("Temperature (celsius) : %.4f \n", cels);
        ss.close();

    }
    
}
