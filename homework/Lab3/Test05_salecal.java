package Lab3;
import java.util.Scanner;

public class Test05_salecal
{
    public static void main(String[] args) {
        Scanner las = new Scanner(System.in);
        int price;
        int salenum;
        double sale = 0;
        double tprice = 0;
        System.out.println("=== Program discount price ===");
        System.out.print("Input price : ");
        price = las.nextInt();
       
        if(price >= 1 && price <= 500)
        {
            sale = 0;
        }
        else if(price >= 501 && price <= 1000)
        {
            sale = price * 3 / 100;
        }
        else if(price >= 1001 && price <= 2000)
        {
            sale = price * 4 / 100;
        }        
        else if(price >= 2001 && price <= 5000)
        {
            sale = price * 7 / 100;
        }
        else if(price >= 5001)
        {
            sale = price * 10 / 100;
        }
       
        tprice = price - sale;
        salenum = (int)(tprice - price);

        System.out.println("=== Calculate total price ===");
        System.out.printf("Total Price : %.0f", tprice);
        System.out.printf("(%d Bath)",salenum);
        las.close();

    }
}