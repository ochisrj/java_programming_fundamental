package Lab4.SheetLab;

import java.util.Scanner;

public class Test05_saleprice {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input status of member : ");
        char status = lsa.next().charAt(0);
        System.out.print("Input price : ");
        int price = lsa.nextInt();

        int sale = 0;

        switch (status) {
            case 'Y':
            case 'y':
                if(price >= 1 && price <= 500)
                {
                    System.out.printf("Total Price : %d (no sale)" , price);
                    break;
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

                int cal_sale = price - sale ;
                System.out.printf("Total Price : %d (-%d baht)" , cal_sale , sale);
                break;
                
            case 'N':
            case 'n':
                if(price >= 1 && price <= 500)
                {
                    System.out.printf("Total Price : %d (no sale)" , price);
                    break;
                }
                else if(price >= 501 && price <= 1000)
                {
                    System.out.printf("Total Price : %d (no sale)" , price);
                    break;
                }
                else if(price >= 1001 && price <= 2000)
                {
                    sale = price * 3 / 100;
                }
                else if(price >= 2001 && price <= 5000)
                {
                    sale = price * 3 / 100;
                }
                else if(price >= 5001)
                {
                    sale = price * 7 / 100;
                }

                int cal_saleN = price - sale ;
                System.out.printf("Total Price : %d (-%d baht)" , cal_saleN , sale);
            default:
                break;
        }

        lsa.close();
    }
    
}
