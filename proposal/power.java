/**
 * @method power use to calculate a power of numver
 * @param base base number
 * @param exponent the power number
 * @return เลขโต้กลับ
 */

public class power {
    public static int power(int base , int exponent){
        if(exponent == 0)
        {
            return 1;
        }
        else
        {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3));
    }
}
