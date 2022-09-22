package Collection;

	import java.util.Vector;

	public class Sample10 {
		public static void main(String[]args)
		{
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		Vector l2=new Vector();
		l2.add(50);
		l2.add(40);
		l2.add(30);
		l2.add(90);
		System.out.println("before");
		System.out.println(l1);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println("after");
		
		System.out.println(l1);
		System.out.println(l2);
		}
	}


