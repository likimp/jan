package overriding;
class Telegram_V1 
{
	void send()
	{
		System.out.println("Text msg,photo");
	}
}
class Telegram_V2 extends Telegram_V1  
{
	void send()
	{
		System.out.println("Text msg,photo,video,doc,live location,gif,pdf");
	}
}
class Mainclass5
{
	public static void main(String[] args) 
	{
		Telegram_V2 t2=new Telegram_V2();
		t2.send();
	}
}

