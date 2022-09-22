package polymorphism;
class Bigbazar
{
	void item()
	{
		System.out.println("product are availabe");
	}
}
class vegetables extends Bigbazar
{
	void item()
	{
		System.out.println("vegetable are availabe");
	}
}
class Fooditem extends Bigbazar
{
	void item(){
		System.out.println("Groceries are available");
	}
}
class HomeAPlilance extends Bigbazar
{
	void item(){
		System.out.println("Homeapliance are available");
	}
}
class Bono
{
	static void garg(Bigbazar b1)
	{
		b1.item();
	}
	
}
class Sample4 {
public static void main(String[] args)
{
	vegetables v1=new vegetables();
	Fooditem f1=new Fooditem();
	HomeAPlilance h1=new HomeAPlilance();
			Bono.garg(v1);
	Bono.garg(f1);
	Bono.garg(h1);
}
}
