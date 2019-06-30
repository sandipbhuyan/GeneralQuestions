public class FC7
{
    public static void main(String[] args) {
        char a = 'a';
        if(a < 90 && a > 64)
        {
            System.out.println(a + "->"+ Character.toLowerCase(a));
        }
        else
        {
            System.out.println(a + "->"+ Character.toUpperCase(a));
        }
    }
}