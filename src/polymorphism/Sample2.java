package polymorphism;
class Amazon
{
	void order(){
		System.out.println("ordered online");
	}
}
class Shoes extends Amazon
{
	void order(){
		System.out.println("book shoes");
	}
}
class Prime extends Amazon
{
	void order(){
		System.out.println("watch movie");
		
	}
}
class Electronics extends Amazon
{
	 void order(){
		System.out.println("order electronic items");
	}
}
class Cong
{
	static void hi(Amazon h1){
		h1.order();
	}
}
class Sample2 {
public static void main(String[] args)
{
	Shoes s1=new Shoes();
	Prime p1=new Prime();
	Electronics e1=new Electronics();
			Cong.hi(s1);
			Cong.hi(p1);
			Cong.hi(e1);
}
}
