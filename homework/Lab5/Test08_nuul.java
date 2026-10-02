package Lab5;
import java.util.Scanner;

public class Test08_nuul {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt();
        
        if(a % 2 == 0){
            for(int i = 0 ; i < a ; i++){
                System.out.print("* ");
            }
        }
        else{
            for(int i = 0 ; i < a ; i++){
                System.out.print("+ ");
            }
        }
    }
}
