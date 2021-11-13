package collections;
import java.util.*;
// linked list methods are exact same as array list(only diff is that u can add and remove elements in any location)
public class Linked_List_Basic {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Rohan");
		ll.add("Rohit");
		System.out.println(ll);
		
		//add
		ll.addFirst("Rahul");// add in first position
		ll.addLast("Ryan");// add at last position
		ll.add(1,"Renita");// add at index 1
		System.out.println(ll);
		
		// addAll,remove, adding object, iterator everything exact same as array list
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Rohini");
		ll1.add("Raushan");
		ll1.add("Rohini");
		ll1.add("Raushan");
		ll.addAll(1,ll1);// add full ll1 at index 1 of ll
		System.out.println(ll);
		
		// ll.remove(0) based on index and ll.remove("Rohan") based on value
		ll.removeFirst();// remove first element
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		ll.removeFirstOccurrence("Rohini");// remove first occurence
		System.out.println(ll);
		
		ll.removeLastOccurrence("Raushan");
		System.out.println(ll);
		
		// Print in reverse order
		Iterator<String> itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ll.clear();// clear all elements
		System.out.println(ll);
	}

}
