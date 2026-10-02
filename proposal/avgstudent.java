import java.util.Scanner;

public class avgstudent {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input Student : ");
        int N = lsa.nextInt();
        double sum = 0;
        double max = 0;
        for(int i = 1; i <= N;i++){
            System.out.print("Input Score : ");
            double score = lsa.nextDouble();
            sum = score + 1;
            
            if(i == 1){
                max = score;
            }
            else if(max < score){
                max = score;
            }
        }
        double average = sum / N;
        System.out.printf("Average score : %.2f\n" , average);
        System.out.printf("Max score : %.2f" , max);
        lsa.close();
    }
    
}
