package collections;
import java.util.*;
public class Array_List_Basic {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();// array list ar holds only integer values
		ar.add(10);
		ar.add(50);
		for(int i=0;i<ar.size();i++)// to print using for loop(can also use iterator and for-each loop)
		{
			System.out.println(ar.get(i));// to get element based on index
		}
		System.out.println(ar.size());// size of array list
		System.out.println("//////////////////");
		System.out.println(ar);// another way to print
		System.out.println("//////////////////");
		
		
		ar.set(0,9);// to replace the value at index 0 with value of 9
		
		
		Iterator<Integer> itr = ar.iterator();// to iterate thru all integer values of ar
		while(itr.hasNext())
		{
			System.out.println(itr.next());// to print current value and then itr points to next element
		}
		System.out.println("//////////////////");
		
		
		ar.add(60);
		ar.remove(0);// removes value at index 0
		
		for(int i:ar)//printing using for each loop
			System.out.println(i);
		System.out.println("//////////////////");
		
		
		System.out.println(ar.indexOf(60));// returns index of value 60
		System.out.println("//////////////////");
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();// create ar1 arraylist
		System.out.println(ar1.isEmpty());// checks if it is empty(returns true or false)
		System.out.println("//////////////////");
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		ar.addAll(ar1);// adds all elements of ar1 to ar
		System.out.println(ar);
		System.out.println("//////////////////");
		
		ar.retainAll(ar1);//stores in ar elements which are common to ar and ar1 only
		System.out.println(ar);
		System.out.println("//////////////////");
		
		ar.add(90);
		ar.removeAll(ar1);// removes all ar1 elements from ar
		System.out.println(ar);
		System.out.println("//////////////////");
		System.out.println(ar.isEmpty());
		
	}

}
