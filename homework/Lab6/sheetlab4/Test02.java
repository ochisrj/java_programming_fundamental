package Lab6.sheetlab4;

public class Test02 {
    public static float average(int[] list) {
        int avg = sum(list);

        return (float) avg / list.length;
    }

    public static int sum(int[] list)
    {
        int total = 0;

        for(int num :  list)
        {
            total += num;
        }
        return total;
    }
    
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        float result = avg(list);
        System.out.println(result);
    }

}
