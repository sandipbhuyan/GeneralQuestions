import java.util.Scanner;

public class FC8
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        char col = color.charAt(0);
        switch(col)
        {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Color");
        }
        scan.close();
    }
}