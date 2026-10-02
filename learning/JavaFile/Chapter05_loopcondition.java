package learning.JavaFile;

public class Chapter05_loopcondition {

    public static void main(String[] args) {
        int num = 1;

        // วนซ้ำแบบไม่รู้กำหนด
        while(num <= 10){
            System.out.println("while num " + num);   
            num++; 
        }

        // วนซ้ำแบบมีกำหนด
        for (num = 1 ; num <= 10 ; num++)
        {
            System.out.println("for num " + num);
        }

        int count = 1;
        do{
            System.out.println("do while num " + count);
            count++;
        }
        while(count <=10);

        // continue เป็นการทำต่อจากเงื่อนไขที่กำหนดมา
        for (int i = 1 ; i < 10 ; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
