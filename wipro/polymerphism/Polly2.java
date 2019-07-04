/**
 * Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
 * For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase (). 
 * The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively
 * The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively.
 * Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
 * Shape c=new Circle();
 * Shape t=new Triangle();
 * Shape s=new Square();
 */

 class Shape{
     public void draw()
     {
         System.out.println("Drawing shape");
     }
     public void erase()
     {
         System.out.println("Earasing shape");
     }
}

class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }
    public void erase()
    {
        System.out.println("Earasing Traingle");
    }
}

class Circle extends Shape 
{
    public void draw()
    {
        System.out.println("Drawing circle");
    }
    public void erase()
    {
        System.out.println("Earasing Circle");
    }
}

class Square extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Squre");
    }
    public void erase()
    {
        System.out.println("Earasing Squre");
    }
}

class Solution 
{
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}