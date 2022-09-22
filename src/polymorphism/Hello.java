package polymorphism;
class Ola{
	void book(){
		System.out.println("online booking");	
	}
}
class Cab extends Ola
{
	void book(){
		System.out.println("book auto,mini");
	}
}
class Grocery extends Ola{
	void book(){
		System.out.println("book grocery");
	}
}
class Fruits extends Ola{
	void book(){
		System.out.println("book Fruits");
	}
}
class Stimulator{
	static void ansi(Ola o1)
	{
		o1.book();
	}
}
class Hello {
public static void main(String[] args)

{
	Cab c=new Cab();
	Grocery g=new Grocery();
	Fruits f=new Fruits();
	Stimulator.ansi(c);
	Stimulator.ansi(g);
	Stimulator.ansi(f);
	System.out.println("Hello");
}
}
