public class FC14
{
    public static void main(String[] args) {
       if(args.length == 0)
       {
           System.out.println("Enter a number please");
       }
       else{
            if(isPrime(Integer.parseInt(args[0])))
            {
                System.out.println(args[0] + "is a prime number");
            }
            else
            {
                System.out.println(args[0] + "is not a prime number");
            }
       }
       
        
    }
    public static boolean isPrime(int n)
    {
        for(int i = 2; i <  n/2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}