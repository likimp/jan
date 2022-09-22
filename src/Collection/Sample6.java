package Collection;

import java.util.Vector;

public class Sample6 {
	public static void main(String[]args)
	{
		Vector l1=new Vector();
		l1.add("hello");
		l1.add('A');
		l1.add(60.8);
		l1.add(65);
		for(int i=0;i<=2;i++)
		{
			Object a2=l1.get(i);
			System.out.println(a2);
		}
	}
}
