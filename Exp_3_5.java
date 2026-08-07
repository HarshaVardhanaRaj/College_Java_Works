abstract class Shape
{	
	abstract void area();
}

class Circle extends Shape
{
	double rad;

	Circle(double rad)
	{
		this.rad = rad;
	}
	
	void area()
	{
		System.out.println("Area of Circle = "+(3.14*rad*rad));
	}
}

class Rectangle extends Shape
{
	int ln, br;

	Rectangle(int ln, int br)
	{
		this.ln = ln;
		this.br = br;
	}
	
	void area()
	{
		System.out.println("Area of Rectangle = "+(ln*br));
	}
}

class Triangle extends Shape
{
	int a, b, c;

	Triangle(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void area()
	{
		int s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle = "+(area));
	}
}

class Exp_3_5
{
	public static void main(String args[])
	{
		Shape c1 = new Circle(3.5);
		Shape r1 = new Rectangle(10,25);
		Shape t1 = new Triangle(3,4,5);
		c1.area();
		r1.area();
		t1.area();
	}
}
