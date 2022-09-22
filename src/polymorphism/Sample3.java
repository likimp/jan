package polymorphism;
class Phonepe
{
	void pay()
	{
		System.out.println("payement");
	}
}
class Recharge extends Phonepe
{
	void pay(){
		System.out.println("recharge the sim");
	}
}
class Payment extends Phonepe
{
	void pay(){
		System.out.println("pay the money");
	}
}
class Insurance extends Phonepe
{
	void pay()
	{
		System.out.println("renewal the insurance");
	}
}
class Slim
{
	static void heso(Phonepe b1)
	{
		b1.pay();
	}
}
public class Sample3 {
public static void main(String[] args)
{
	Recharge r1=new Recharge();
	Payment p1=new Payment();
	Insurance i1=new Insurance();
	Slim.heso(r1);
	Slim.heso(p1);
	Slim.heso(i1);
}
}
