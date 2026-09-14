package Array1D;
public class kee5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 4, 6, 8, 10, 12};
        int[] ab = new int[a.length + b.length];
        int pos = 0;
        
        for(int i = 0 ; i < a.length ; i++)
        {
            ab[pos++] = a[i];
        }
        for(int i = 0 ; i < b.length ; i++)
        {
            ab[pos++] = b[i];
        }
        for(int i = 0 ; i < ab.length ; i++)
        {
            System.out.print(ab[i] + " ");
        }
    
    
    
    }
}
