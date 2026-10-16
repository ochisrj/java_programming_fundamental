package Lab6.sheetlab4;

public class Test02 {
    /**
     * average use for find average in array
     * @param average 
     * @return avg 
     */
    public static float average(int[] list) {
        int avg = sum(list); // call sum method

        return (float) avg / list.length; // cal the average by length of list
    }

    /**
     * find summary
     * @param sum
     * @return
     */
    public static int sum(int[] list)
    {
        int total = 0; // create int

        for(int num :  list) // find length of list in num
        {
            total += num; // increase total 
        }
        return total; // return value to total
    }
    /**
     * Main Program
     * @param main
     */
    public static void main(String[] args) {
        // create array name list
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        // create result to call method
        float result = average(list);
        System.out.println(result); // display result
    }

}
