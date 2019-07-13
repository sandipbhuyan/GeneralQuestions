class Animal
{
    public void eat()
    {
        System.out.println("Animal Class eat method");
    }

    public void sleep()
    {
        System.out.println("Animal Class Sleep method");
    }
}

class Bird extends Animal
{
    public void fly()
    {
        System.out.println("Bird class Fly method");
    }
}


class Solution
{
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}