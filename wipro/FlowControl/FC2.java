import java.util.Scanner;

public class FC2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();
        if(n % 2 == 0)
        {
            System.out.println("The Number is Even Number");
        }
        else
        {
            System.out.println("The Number is Odd Number");
        }
    }
} 