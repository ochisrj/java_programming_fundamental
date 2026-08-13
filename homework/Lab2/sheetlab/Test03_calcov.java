package Lab2.sheetlab;
import java.util.Scanner;

public class Test03_calcov{
   public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       double inch,meter,centi,tcenti;

       System.out.print("How long pole (inch) : ");
       inch = kb.nextFloat();
       tcenti = inch *2.54;
       meter = (int)(tcenti / 100);
       centi = tcenti % 100;

       System.out.println("=== Covert inch to meter ===");
       System.out.printf("Your pole long : %.0f meters and %.0f centimeters" , meter , centi);
       kb.close();   
   }
}
