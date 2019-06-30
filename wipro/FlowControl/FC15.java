import java.util.Scanner;

public class FC15
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while(n > 0)
        {
            int temp = n % 10;
            n = n / 10;
            sum += temp;
        }
        System.out.println(sum);
        s.close();
    }
}