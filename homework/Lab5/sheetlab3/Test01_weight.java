package Lab5.sheetlab3;

import java.util.Scanner;

public class Test01_weight {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();

        int count = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            int weight = lsa.nextInt();   
            if(weight >= 60)
            {
                count++;
            }
        }
        System.out.println(count);

        lsa.close();
    }
}
