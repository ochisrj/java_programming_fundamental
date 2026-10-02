package Test;

import java.util.Scanner;

public class quiz5 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        String password = lsa.nextLine();

        if(password.length() < 8){
            System.out.println("Password are to shit");
        }
        else{
            boolean hasletter = false;
            boolean hasnumber = false;

            for(char ch: password.toCharArray()){
                if(Character.isLetter(ch)) hasletter = true;
                if(Character.isLetter(ch)) hasnumber = true;
            }
            if(hasletter && hasnumber){
                System.out.println("Password so chad");
            }
            else {
                System.out.println("Password so mid");
            }
        }
        lsa.close();

    }
}
