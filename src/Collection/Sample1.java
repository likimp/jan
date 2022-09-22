package Collection;

import java.util.Vector;

public class Sample1 {
	public static void main(String[] args) {
		Vector l1=new Vector(3);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		for(int i=0;i<l1.size();i++){
			Object a1=l1.get(i);
			System.out.println(a1);
		}
	}
}
