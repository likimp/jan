package overriding;

class Whatsapp_v1
{
	void send()
	{
		System.out.println("text msg,photo");
	}
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void send()
	{
		System.out.println("text msg,photo,video,gif,doc,live location");
	}
}

public class moriding {
	public static void main(String[] args){
		
		Whatsapp_v2 w2=new Whatsapp_v2();
		w2.send();
}
}
