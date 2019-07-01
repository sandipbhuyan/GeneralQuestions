public class Arr2
{
    public static void main(String[] args) {
        int arr[] = {10,3,22,4,55,3};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max Number is : " + max + "\n Min Number is : " + min);
    }
}