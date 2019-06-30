public class FC19
{
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while(true)
        {
            if( count >= 5)
            {
                break;
            }
            if(i % 2 == 0 || i % 3 == 0|| i % 5 == 0)
            {
                System.out.println(i);
                count++;
            } 
            i++;
        }
    }
}