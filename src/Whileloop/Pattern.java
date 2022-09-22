package Whileloop;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=5,star=5;
           for(int i=1;i<=3;i++)
           {
        	   for(int j=1;j<=space;j++)
        	   {
        		   if(j==2)
        		   {
        			   System.out.print("*");
        		   }
        	   }
        	   for(int k=i;k<=star;k++)
        	   {
        		   if(k==4|k==5)
        		   {
        			   System.out.print(" ");  
        		   }
        		   System.out.print("*"); 
        	   
        	   
        	   System.out.println();
        	   
           }
	}
	}
}



