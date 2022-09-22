package Expectionhandling;

public class Unacademy {
static void offer() throws unacademyException
{
	int discount=4999;
	if(discount>=5000)
	{
		System.out.println("20% discount");
	}
	else{
		throw new unacademyException("no discount"); 
	}
}
public static void main(String[] args)
{
	try
	{
		offer();
	}
	catch(unacademyException e)
	{
		System.out.println(e.getmsg());
	}
}
}
class unacademyException extends Exception
{
	String msg;
	unacademyException (String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
