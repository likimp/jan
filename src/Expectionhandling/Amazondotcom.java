package Expectionhandling;

public class Amazondotcom {
static void book() throws AmazonException
{
	int shirt=2999;
	if(shirt>=3000){
	System.out.println("discount of 500rs ");
	}

else
{
	throw new AmazonException("no discount");
}
}
public static void main(String[] args)
{
	try
	{
		book();
	}
	catch(AmazonException e)
	{
		System.out.println(e.getmsg());
	}
  }
}
class AmazonException extends Exception
{
	String msg;
	AmazonException (String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}