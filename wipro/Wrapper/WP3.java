import java.util.Scanner;

public class WP3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String binary = String.format("%08d",Integer.parseInt(Integer.toBinaryString(i)));
        System.out.println(binary);
        scan.close();
    }
}