class Shape
{	
	double area;

	void area()
	{
		System.out.println("Area = "+area);
	}
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
		area = 3.14*rad*rad;
		super.area();
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
		area = ln*br;
		super.area();
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
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		super.area();
	}
}

class Exp_3_5
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(3.5);
		Rectangle r1 = new Rectangle(10,25);
		Triangle t1 = new Triangle(3,4,5);
		c1.area();
		r1.area();
		t1.area();
	}
}