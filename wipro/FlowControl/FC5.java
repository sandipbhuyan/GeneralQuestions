import java.util.Scanner;

public class FC5
{
    public static void main(String[] args) {
        int arr[] = {1,4,34,56,7};
        Scanner scan = new Scanner(System.in);
        int src = scan.nextInt();
        int index = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(src == arr[i])
            {
                index = i;
                break;
            }
        }
        System.out.println(index);
        scan.close();
    }
}