package Collection;

import java.util.PriorityQueue;

public class Sample16 {
public static void main(String[] args){
	PriorityQueue l1=new PriorityQueue();
	l1.add(1);
	l1.add(80);
	l1.add(60);
	l1.add(59);
	System.out.println("***peeking***");
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1);
	System.out.println("***poling***");
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.poll());
	System.out.println(l1);
}
}
