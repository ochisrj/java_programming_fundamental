// จงเขียนโปรแกรมเพื่อรับข้อมูล 2 จำนวน (m และ n) เพื่อเก็บเมเทริกศ์ขนาด m x n

// จากนั้นวนรับข้อมูลของเมทริกซ์ที่ละตัวจนครบและแสดงผลการทรานสโพสของเมทริกซ์นั้นทางหน้าจอ

// Testset
// Example 1:
// Input:
// 2 3
// 1 2 3
// 4 5 6

// Output:
// 1 4 
// 2 5 
// 3 6 

// Example 2:
// Input:
// 2 5
// 1 2 3 4 5
// 6 7 8 9 10

// Output:
// 1 6 
// 2 7 
// 3 8 
// 4 9 
// 5 10 

// Example 3:
// Input:
// 5 5
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5

// Output:
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 

// Example 4:
// Input:
// 3 4
// 1 2 3 4
// 4 3 2 1
// 1 2 3 4

// Output:
// 1 4 1 
// 2 3 2 
// 3 2 3 
// 4 1 4 

// Example 5:
// Input:
// 4 5 
// 1 2 3 4 5
// 5 4 3 2 1
// 1 1 1 1 1
// 2 2 2 2 2

// Output:
// 1 5 1 2 
// 2 4 1 2 
// 3 3 1 2 
// 4 2 1 2 
// 5 1 1 2 

package Lab6;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int m = lsa.nextInt();
        int n = lsa.nextInt();

        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = lsa.nextInt();
            }
        }

        for(int j = 0; j < n; j++)
        {
            for(int i = 0; i < m; i++)
            {
                System.out.print(matrix[i][j] + " ");
            }   
            System.out.println();
        }
        lsa.close();
    }
}
