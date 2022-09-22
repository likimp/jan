package overriding;
class Ola_V1 
{
	void book()
	{
		System.out.println("cab,Auto");
	}
}
class Ola_V2 extends Ola_V1
{
	void book()
	{
		System.out.println("cab,Auto,sedan,food,Grocery");
	}
}


public class mainclass3 {
	public static void main(String[] args) 
	{
     Ola_V2 o2=new Ola_V2();
	 o2.book();
	}
}
