public class Arr8
{
    public static void main(String[] args) {
        if(arr.length < 4)
        {
            System.out.println("Enter four elements");
        }
        else
        {
            int arr[][] = new int[2][2];
            arr[0][0] = Integer.parseInt(args[0]);
            arr[0][1] = Integer.parseInt(args[1]);
            arr[1][0] = Integer.parseInt(args[2]);
            arr[1][1] = Integer.parseInt(args[3]);

            for(int i = 1; i >=0; i--)
            {
                for(int j = 1; j >= 0; j--)
                {
                    System.out.print(arr[i][j]+ "\t");
                }
                System.out.println();
            }
        }
    }
}