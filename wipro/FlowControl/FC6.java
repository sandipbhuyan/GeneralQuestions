public class FC6
{
    public static void main(String[] args) {
        if(args[0].equals("Femail"))
        {
            if(Integer.parseInt(args[1]) < 59)
            {
                System.out.println("percentage of interest is 8.2%");
            }
            else{
                System.out.println("percentage of interest is 9.2%");                
            }
        }
        else
        {
            if(Integer.parseInt(args[1]) < 59)
            {
                System.out.println("percentage of interest is 8.4%");
            }
            else{
                System.out.println("percentage of interest is 10.5%");
            }
        }
    }
}