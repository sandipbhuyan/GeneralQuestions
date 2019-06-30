import java.util.Scanner;

public class FC1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();
        if(n == 0)
        {
            System.out.println("The Number is Zero");
        }
        else
        {
            if(n < 0)
            {   
                System.out.println("The Number is Negative");
            }
            else
            {
                System.out.println("The Number is Positive");
            }
        }
    }
}