package Collection;

import java.util.ArrayList;

public class Sample13 {
	public static void main(String[]args)
	{
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	ArrayList l2=new ArrayList();
	l2.add('A');
	l2.add('B');
	l2.add(34.8);
	l2.add("hi");
	System.out.println("before");
	System.out.println(l1);
	System.out.println(l2);
	l1.addAll(2,l2);
	System.out.println("after");
	
	System.out.println(l1);
	System.out.println(l2);
	}
}

