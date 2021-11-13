//Write a Java program to remove the duplicate elements of a given array and return 
//the new length of the array.
package numberPrograms;
import java.util.*;
public class Remove_Duplicate_From_Array {
	int temp,count;
	public void sortArray(int arr[])       
	{
		for(int i=0;i<arr.length;i++)
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
		System.out.println();
		removeDuplicate(arr);
	}
	public void removeDuplicate(int arr[])
	{
		count=0;
		int temp_arr[]=new int[arr.length];
		for(int i=0;i<(arr.length-1);i++)// checks if adjacent elements are equal does not account for last element tho
		{
			if(arr[i]!=arr[i+1])
			{
				temp_arr[count++]=arr[i];
			}
		}
		temp_arr[count++]=arr[arr.length-1];// add last element of sorted array
		System.out.println("New Array is:");
		for(int i=0;i<count;i++)
		{
			System.out.print(temp_arr[i]+" ");
		}
		System.out.println();
		System.out.println("Length of New Array is : "+count);
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
		Remove_Duplicate_From_Array obj = new Remove_Duplicate_From_Array();
		obj.sortArray(a);
	}
}
