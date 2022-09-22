package Encapsulation;
class name{
	private String name="LOhith";
	public String getname(){
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
}
public class std_name {
	public static void main(String[] args) {
		name n1=new name();
			String a=n1.getname();
			System.out.println(a);
			n1.setname("Lalith");
			String b=n1.getname();
			System.out.println(b);
	}
}

