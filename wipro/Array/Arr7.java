public class Arr7
{
    public static void main(String[] args) {
        int arr[] = {12,34,12,45,67,89};
        int res[] = new int[arr.length];
        for(int i = 0; i  < arr.length; i++)
        {
            res[i] = 0;
        }       
        for(int i = 0; i < arr.length; i++)
        {
            for(int j =1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    res[j] = 1;
                }
            }
        }
        for(int i = 0; i  < arr.length; i++)
        {
            if(res[i] == 0)
            {
                System.out.print(arr[i]+ "\t");
            }
        }
    }
}