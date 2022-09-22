package Encapsulation;
class Salary
{
	private int sal=29000;
	public int getSalary(){
	return sal;	
	}

public void SetSalary(int sal){
this.sal=sal;	
}
}
public class Mainclass2 {
	public static void main(String[] args) {
   Salary s1=new Salary();
   int a=s1.getSalary();
    System.out.println(a);
    s1.SetSalary(58888);
    int b=s1.getSalary();
    System.out.println(b);
}
}
