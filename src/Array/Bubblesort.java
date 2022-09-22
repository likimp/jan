package Array;

public class Bubblesort {

	public static void main(String[] args) {
		int[]arr={80,25,90,20,6};
		int size=arr.length-1;
		for(int j=0;j<size;j++)
		{
			for(int i=0;i<size;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
for(int k=0;k<arr.length;k++)
{
	System.out.println(arr[k]);
}
	}

}
