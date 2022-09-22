package Encapsulation;
class empId{
	private String id="va102";
	public String getId(){
		return id;
	}

public void setId(String id){
	this.id=id;
}
}
public class Mainclass4 {

	public static void main(String[] args) {
		empId e1=new empId();
		String a=e1.getId();
		System.out.println(a);
		e1.setId("va231");
		String b=e1.getId();
		System.out.println(b);
	}

}
