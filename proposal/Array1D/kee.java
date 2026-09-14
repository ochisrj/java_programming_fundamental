package Array1D;
public class kee {
    public static void main(String[] args) {
        int[] m = new int[1000];
        
        for(int i = 0 ; i <= 1000 ; i++)
        {
            m[i] = i + 1;
        }
        
        for(int i = 0 ; i <= 1000 ; i++)
        {
            System.out.print(m[i] + " ");
        }
    }
}
