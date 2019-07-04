public class CNO2
{
    public static int powerInt(int num1,int num2)
    {
        return (int)Math.pow((double)num1,(double)num2);
    }

    public static double powerDouble(double num1, double num2)
    {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        System.out.println(CNO2.powerInt(10,20));
        System.out.println(CNO2.powerDouble(10,20));

    }
}