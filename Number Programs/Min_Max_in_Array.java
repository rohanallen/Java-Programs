// to find max and min values in an array
package numberPrograms;
import java.util.*;
public class Min_Max_in_Array {
	int min,max;
	public void min(int arr[]) 
	{
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Element in Array is "+(min));
	}
	public void max(int arr[]) 
	{
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest Element in Array is "+(max));
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Element "+(i+1));
			a[i]=in.nextInt();
			
		}
		Min_Max_in_Array obj = new Min_Max_in_Array();
		obj.min(a);
		obj.max(a);
	}

}
