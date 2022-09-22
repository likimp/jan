package overriding;
class Phonepe_V1
{
	void sendmoney()
	{
		System.out.println("Account num,contact num");
	}
}
class Phonepe_V2 extends Phonepe_V1
{
	void sendmoney()
	{
	    System.out.println("Account num,contact num,Contact name,upi");
	}
}
class Mainclass4
{
	public static void main(String[] args) 
	{
       Phonepe_V2 p2=new Phonepe_V2();
       p2.sendmoney();
	}
}


