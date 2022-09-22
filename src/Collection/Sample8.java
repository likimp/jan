package Collection;

import java.util.Vector;

public class Sample8 {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add("Tumkur");
		l1.add("Mysore");
		l1.add("Banglore");
		l1.add("Chennai");
		l1.add("Hyderabad");
		l1.add(0);
		System.out.println(l1);
		l1.remove("Mysore");
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
	}
       
}
