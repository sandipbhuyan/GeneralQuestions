/*
 Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/

class Fruit
{
    String name;
    String taste;
    double size;
    Polly(String name, String taste, double size)
    {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat()
    {
        System.out.println("Name of the fruit is: "+ this.name + ". Taste is : " + this.taste);
    }
}

class Apple extends  Fruit
{
    Apple()
    {
        parent("Apple", "Sweet", 100);
    }
    public void eat()
    {
        System.out.println("Name of the fruit is apple. taste is sweet");
    }
}


class Orange extends  Fruit
{
    Orange()
    {
        parent("Orange", "Sweet", 100);
    }
    public void eat()
    {
        System.out.println("Name of the fruit is orange. taste is sweet and pickly");
    }
}

class Solution 
{
    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();
        a.eat();
        o.eat();
    }
}
