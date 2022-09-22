package Collection;
import java.util.Vector;
public class Sample2 {

	public static void main(String[] args) {
	Vector l1=new Vector(6);
    l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	System.out.println(l1.size());
	System.out.println("capacity-->"+ l1.capacity());
	l1.add(50);
	l1.add(60);
	l1.add(70);
	System.out.println(l1.size());
	System.out.println("capacity-->"+ l1.capacity());
	}

}
