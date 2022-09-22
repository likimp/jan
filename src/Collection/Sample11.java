package Collection;

	import java.util.Vector;

	public class Sample11 {
		public static void main(String[]args)
		{
		Vector l1=new Vector();
		l1.add("Men");
		l1.add("Women");
		l1.add("kids");
		l1.add("Electonics");
		System.out.println(l1);
		if(l1.contains("kids"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		}
	}
		



