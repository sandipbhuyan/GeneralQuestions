public class Arr9
{
    public static void main(String[] args) {
        if(arr.length < 9)
        {
            System.out.println("Enter nine elements");
        }
        else
        {
            int arr[][] = new int[3][3];
            arr[0][0] = Integer.parseInt(args[0]);
            arr[0][1] = Integer.parseInt(args[1]);
            arr[0][2] = Integer.parseInt(args[2]);
            arr[1][0] = Integer.parseInt(args[3]);
            arr[1][1] = Integer.parseInt(args[4]);
            arr[1][2] = Integer.parseInt(args[5]);
            arr[2][0] = Integer.parseInt(args[6]);
            arr[2][1] = Integer.parseInt(args[7]);
            arr[2][2] = Integer.parseInt(args[8]);
            int max = arr[2][2];
            for(int i = 2; i >=0; i--)
            {
                for(int j = 2; j >= 0; j--)
                {
                    if(arr[i][j] > max)
                    {
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("The maxium number in the array is: " + max);
        }
    }
}