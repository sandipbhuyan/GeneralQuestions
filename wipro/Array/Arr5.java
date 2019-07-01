public class Arr5
{
    public static void main(String[] args) {
        int arr[] = {10,2,34,55,77,86,1,3,54};
        int lar1 = arr[0];
        int lar2 = arr[0];
        int sm1 = arr[0];
        int sm2 = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > lar1)
            {
                lar2 = lar1;
                lar1 = arr[i];
            }
            if(arr[i] < sm1)
            {
                sm2 = sm1;
                sm1 = arr[i];
            }
        }
        System.out.println("Lrgest numbers are : " + lar1 + ", " + lar2);
        System.out.println("Smallest numbers are : " + sm1 + ", " + sm2);
    }
}