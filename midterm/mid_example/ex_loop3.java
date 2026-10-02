// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 

package midterm.mid_example;


public class ex_loop3 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(n);

        for(int i = 1 ; i <= n; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
