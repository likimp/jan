package Expectionhandling;

public class voterId {
	static void qualify() throws voteException
	{
		int age=16;
		if(age>=18)
		{
			System.out.println("eliglible for voting");
		}
		else
		{
			throw new voteException("not eligible");
		}
	}
		public static void main(String[] args)
		{
			try
			{
				qualify();
			}
			catch(voteException e)
			{
				System.out.println(e.getMsg());
			}
		}
	}

class voteException extends Exception
{
	String msg;
	

voteException(String msg)
{
	this.msg=msg;
}
public String getMsg()
{
	return msg;
}
}
