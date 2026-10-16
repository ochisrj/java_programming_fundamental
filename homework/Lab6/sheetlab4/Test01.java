/**
 * @author kittipoom samranjai
 * @student-id 69160134
 */

package Lab6.sheetlab4;

public class Test01
{
    /**
     * Method sum to calculate the summary of number
     * @param list an array of int to sum
     * @return total of sum
     */
    public static int sum(int[] list)
    {
        int total = 0;

        for(int i = 0; i < list.length; i++)
        {
            total += list[i];
        }
        return total;
    }
    /**
     * @param list to store array
     * @param summary call sum method to use in list array 
     */
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int summary = sum(list);
        System.out.println("the summary of array list is : " + summary);
    }
}