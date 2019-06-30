import java.util.Scanner;

public class FC18
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");        
        int n = scan.nextInt();
        int reverse = 0;
        int r  = n;
        while(n > 0)
        {
            int temp = n % 10;
            n = n /10;
            reverse = reverse * 10 + temp;
        }
        if(r == reverse)
        {
            System.out.println("The number is a palindrome number");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }
        scan.close();
    }
}