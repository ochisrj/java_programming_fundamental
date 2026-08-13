package Lab1.sheetlab;

public class Test02{

    public static void main(String[] args) {
            int width = 36;
            int height = 4;

            for (int i = 1; i <= height; i++) {
                if (i == 1) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else if (i == 2) {
                    System.out.println("* My name is : Kittipoom Samranjai *");
                }
                else if (i == 3) {
                    System.out.println("* Student Id : 69130164            *");
                }
                else if (i == 4) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        
    }
}