package Expectionhandling;

public class Googlepay {
static void send() throws googlepayException
{
	int money=10;
	if(money>=100)
	{
		System.out.println("get cashback");
	}
	else{
		throw new googlepayException("no cashback");
	}
}
	public static void main(String[] args) {
		try
		{
			send();
		}
		catch(googlepayException e)
		{
			System.out.println(e.getmsg());
		}

	}

}
class googlepayException extends Exception
{
	String msg;
	googlepayException (String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
