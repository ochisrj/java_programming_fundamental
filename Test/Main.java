package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double score = sc.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Invalid Score");
            } else if (score >= 80) {
                System.out.println("Grade: A");
            } else if (score >= 70) {
                System.out.println("Grade: B");
            } else if (score >= 60) {
                System.out.println("Grade: C");
            } else if (score >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
        sc.close();
    }
}