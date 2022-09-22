package overriding;
class kitkat
{
	void camera()
	{
		System.out.println("front camera");
	}
}
class lolipop extends kitkat
{
	void camera()
	{
		System.out.println("front camera,back camera");
	}
}

public class mainclass6 {
public static void main(String[] args){
	lolipop l=new lolipop();
	l.camera();
}
}
