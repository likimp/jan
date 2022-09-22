package Collection;

	import java.util.ArrayList;

	public class Sample12 {
		public static void main(String[]args)
		{
		ArrayList l1=new ArrayList();
		l1.add("Men");
		l1.add("Women");
		l1.add("kids");
		l1.add("Toys");
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
		




