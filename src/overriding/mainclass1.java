package overriding;
class Unacademy_V1 
{
	void classof()
	{
		System.out.println("Live class");
	}
}
	class Unacademy_V2 extends Unacademy_V1
	{
	  void classof()
	  {
       System.out.println("Live class,Download class,note the class");
	  }
	}


public class mainclass1 {
	public static void main(String[] args) 
	{
		Unacademy_V2 u2= new Unacademy_V2();
		u2.classof();
	}
}
