public class WP2
{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        System.out.println("Given Number: " + num);
        System.out.println("Binary Value: " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal value: " + Integer.toHexString(num));
        System.out.println("Octal Value: " + Integer.toOctalString(num));

    }
}