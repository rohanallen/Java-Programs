package collections;
import java.util.*;
// cannot have null key but can have multiple null values
//stores values in ascending order of key
// everything else adding removing same as hash map
public class Tree_Map_Basic {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1,"R");// to add values
		tm.put(2,"T");
		tm.put(10,"Y");
		tm.put(15,"Z");
		tm.put(3,"S");
		tm.put(3,"S");// will only print 3->S once(no duplicate)
		System.out.println(tm);// will get printed in  ascending order of key
		
		tm.remove(3);
		for(Map.Entry<Integer,String> m:tm.entrySet()) // entrySet() converts the map into a set so that it can be iterated
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// print in descending order
		System.out.println(tm.descendingMap());// can use this in NavigableMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		// print key-value pair if key is smaller than equal to 2
		System.out.println(tm.headMap(2,true));
		
		
		// print key-value pair if key is greater than equal to 10
				System.out.println(tm.tailMap(10,true));
				
		// print key-value pair if key is greater than 2 and smaller than and equal to 15
		System.out.println(tm.subMap(2,false,15,true));
		
		
		// print key-value pair if key is smaller than 2
				System.out.println(tm.headMap(2));
				
				
				// print key-value pair if key is greater than or equal to 10
						System.out.println(tm.tailMap(10));
						
				// print key-value pair if key is greater than or equal to 2 and smaller than 15
				System.out.println(tm.subMap(2,15));
	
	}
	
	
	

}
