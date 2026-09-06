abstract class Shape
{
    int a, b;
	abstract void printArea();
}

class Rectangle extends Shape
{
    Rectangle(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void printArea()
    {
        System.out.println("Area of Rectangle = "+a+" * "+b+" = "+(a*b));
    }
}

class Triangle extends Shape
{
    Triangle(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void printArea()
    {
        System.out.println("Area of Triangle = 0.5 * "+a+" * "+b+" = "+(0.5*a*b));
    }
}

class Circle extends Shape
{
    Circle(int a)
	{
		this.a = a;
	}
	
	void printArea()
    {
        System.out.println("Area of Circle = 3.14 * "+a+" ^ 2  = "+(3.14*a*a));
    }
}

class Exp_4_1
{
	public static void main(String args[])
	{
		Shape r = new Rectangle(7,5);
		Shape t = new Triangle(4,5);
		Shape c = new Circle(3);
		r.printArea();
		t.printArea();
		c.printArea();
	}
}
