// to sort array in ascending order
package numberPrograms;
import java.util.*;
public class Sort_Array {
	int temp;
	public void sortArray(int arr[])       
	{
		for(int i=0;i<arr.length;i++)// understand this
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is:");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
			
		}
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
		Sort_Array obj = new Sort_Array();
		obj.sortArray(a);
	}
}
