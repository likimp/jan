package Encapsulation;
class MobilePin {
	private int mpin=2456;
			public int getPin()
			{
				return mpin;
			}
			public void setPin(int mpin)
			{
				this.mpin=mpin;
			}
}
public class Mainclass3 {

	public static void main(String[] args) {
		MobilePin m1=new MobilePin();
		int a=m1.getPin();
		System.out.println(a);
		m1.setPin(39664);
		int b=m1.getPin();
		System.out.println(b);
				

	}

}
