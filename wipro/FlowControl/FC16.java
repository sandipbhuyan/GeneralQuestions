import java.util.Scanner;

public class FC16
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter the number of lines");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}