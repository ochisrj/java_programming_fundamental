package Lab4;

import java.util.Scanner;

public class Test04_calender {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);

        int day = lsa.nextInt();
        int month = lsa.nextInt();
        int year = lsa.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int maxDays = 0;
        String monthName = "";

        switch (month) {
            case 1:  monthName = "JAN"; maxDays = 31; break;
            case 2:  monthName = "FEB"; maxDays = isLeapYear ? 29 : 28; break;
            case 3:  monthName = "MAR"; maxDays = 31; break;
            case 4:  monthName = "APR"; maxDays = 30; break;
            case 5:  monthName = "MAY"; maxDays = 31; break;
            case 6:  monthName = "JUN"; maxDays = 30; break;
            case 7:  monthName = "JUL"; maxDays = 31; break;
            case 8:  monthName = "AUG"; maxDays = 31; break;
            case 9:  monthName = "SEP"; maxDays = 30; break;
            case 10: monthName = "OCT"; maxDays = 31; break;
            case 11: monthName = "NOV"; maxDays = 30; break;
            case 12: monthName = "DEC"; maxDays = 31; break;
            default:
                maxDays = -1; 
                break;
        }

        if (maxDays == -1 || day < 1 || day > maxDays) {
            System.out.println("Invalid");
        } else {
            System.out.println(day + " " + monthName + " " + year);
        }

        lsa.close();
    }
}