package Encapsulation;
class Mobile{
	private int password=1221;
	public int getpwd(){
		return password;
	}
	public void setPwd(int password)
	{
		this.password=password;
	}
}
public class Mainclass {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		int a=m.getpwd();
		System.out.println(a);
        m.setPwd(2208);
        int b=m.getpwd();
        System.out.println(b);
	}

}
