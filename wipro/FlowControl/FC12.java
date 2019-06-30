public class FC12
{
    public static void main(String[] args) {
        if(isPrime(13))
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i = 2; i <  n/2; i++)
        {
            if(n %i == 0)
            {
                return false;
            }
        }
        return true;
    }
}