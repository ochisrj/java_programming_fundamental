package Lab5.sheetlab;

public class Test01_sumodd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i % 2 != 0) {
                sum += i; 
            }
        }
        System.out.println("Sum of odd number from 1-1000 : " + sum);
    }
}
