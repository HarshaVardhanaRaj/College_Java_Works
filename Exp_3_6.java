class Animal
{
	String name, sound;
	void sound()
	{
		System.out.println("Sound of "+name+" = "+sound);
	}
}

class Dog extends Animal
{
	Dog(String name, String sound)
	{
		this.name = name;
		this.sound = sound;
	}
	
	void sound()
	{
		super.sound();
	}
}

class Cat extends Animal
{
	Cat(String name, String sound)
	{
		this.name = name;
		this.sound = sound;
	}
	
	void sound()
	{
		super.sound();
	}
}

class Cow extends Animal
{
	Cow(String name, String sound)
	{
		this.name = name;
		this.sound = sound;
	}
	
	void sound()
	{
		super.sound();
	}
}

class Exp_3_6
{
	public static void main(String args[])
	{
		Animal d = new Dog("Labrador","Bark");
		Animal c = new Cat("Persian Cat","Meow");
		Animal cw = new Cow("Cattle","Moo");
		d.sound();
		c.sound();
		cw.sound();
	}
}