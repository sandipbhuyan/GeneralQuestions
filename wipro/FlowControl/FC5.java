public class FC5
{
    public static void main(String[] args) {
        char a = 'a';
        if(a < 90 && a > 64 || a <123 && a > 96)
        {
            System.out.println("Alphabatic");
        }
        else if(a < 58 && a > 47)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}