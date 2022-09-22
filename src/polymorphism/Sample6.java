package polymorphism;
class Airtel
{
	void payment()
	{
		System.out.println("Airtel app");
	}
}
class Recharging extends Airtel
{
	void payment()
	{
		System.out.println("Recharged");
	}
}
class Music extends Airtel
{
	void payment(){
		System.out.println("Wink music");
	}
}
class Bills extends Airtel
{
	void payment()
	{
		System.out.println("bills payed");
	}
}
class Euro 
{
	static void peso(Airtel d1)
	{
		d1.payment();
	}
}
class Sample6 {
public static void main(String[] args)
{
	Recharging r1=new Recharging();
	Music m1=new Music();
	Bills b1=new Bills();
	Euro.peso(r1);
	Euro.peso(m1);
	Euro.peso(b1);
}

}
