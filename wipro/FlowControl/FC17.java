import java.util.Scanner;

public class FC17
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int reverse = 0;
        while(n > 0)
        {
            int temp = n % 10;
            n = n /10;
            reverse = reverse * 10 + temp;
        }
        System.out.println(reverse);
        scan.close();
    }
}