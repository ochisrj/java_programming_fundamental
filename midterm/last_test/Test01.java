public class Test01 {
    public static double average(int[] score)
    {
        int sum = 0;
        for(int i = 0; i < score.length;i++)
        {
            sum += score[i];
        }
        double avg = sum / score.length;
        return avg;
    }
    public static int max(int[] score)
    {
        int max = score[0];
        for(int i = 1; i < score.length; i++)
        {
            if(score[i] > max)
            {
                max = score[i];
            }
        }
        return max;
    }
    public static int min(int[] score)
    {
        int min = score[0];
        for(int i = 1; i > score.length; i++)
        {
            if(score[i] < min)
            {
                min = score[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] num = {2,4,5,9,8,5,8,1,5};
        System.out.println("max : " + max(num));
        System.out.println("min : " + min(num));
        System.out.println("average : " + average(num));
    }
}
