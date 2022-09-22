package Expectionhandling;

public class Zomoto {
static void order() throws zomotoException
{
	int amount=299;
	if(amount>=500)
	{
		System.out.println("Aplly coupan");
	}
	else{
		throw new zomotoException("not elligble");
	}
}
public static void main(String[] args)
{
	try
	{
		order();
	}
	catch( zomotoException e)
	{
		System.out.println(e.getmsg());
	}
}
}
class  zomotoException extends Exception
{
	String msg;
	 zomotoException (String msg)
	 {
		 this.msg=msg;
	 }
	 public String getmsg()
	 {
		 return msg;
	 }
}
