// 1 2 3 4 5 6 7 8 
//  2 3 4 5 6 7 8 
//   3 4 5 6 7 8 
//    4 5 6 7 8 
//     5 6 7 8 
//      6 7 8 
//       7 8 
//        8 

package midterm.mid_example;

public class ex_loop8 {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i <= n ; i++)
        {
            for(int j = 1 ; j < i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = i ; j <= n; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
