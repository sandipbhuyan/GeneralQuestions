public class CNO1
{
    int h;
    int l;
    int d;

    CNO1(int h, int l, int d)
    {
        this.h = h;
        this.l = l;
        this.d = d;
    }

    public int volume()
    {
        return this.l * this.h * this.d;
    }
    public static void main(String[] args) {
        CNO1 c = new CNO1(10,11,5);
        System.out.println(c.volume());
    }
}