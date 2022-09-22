package overriding;
class Flipkart_V1
{
	void order()
	{
		System.out.println("books,cloths,Electronic item");
	}
}
class Flipkart_V2 extends Flipkart_V1
{
	void order()
	{
		System.out.println("books,cloths,Electronic item,groceries");
	}
}


public class mainclass2 {
	public static void main(String[] args) 
	{
		Flipkart_V2 f2=new Flipkart_V2();
		f2.order();
	}
}
