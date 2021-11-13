package collections;
import java.util.*;
// contains only unique elements
// stores key and corresponding value
// can have only one null key and multiple null values
// does not store in any order
// not synchronized multiple threads can access 
public class Hash_Map_Basic {
public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();// hashmap hm stores int key and string value
		hm.put(1,"R");// to add values
		hm.put(2,"T");
		hm.put(3,"S");
		hm.put(3,"S");// will only print 3->S once(no duplicate)
		System.out.println(hm);// will get printed in any order
		
		
		// to iterate and print
		for(Map.Entry<Integer,String> m:hm.entrySet()) // entrySet() converts the map into a set so that it can be iterated
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// return value at particular key
		System.out.println(hm.get(2));//T
		
	
		hm.putIfAbsent(4,"X");// if not already present add
		System.out.println(hm);
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(5,"A");// to add values
		hm1.put(6,"B");
		hm1.put(16,"C");
		hm1.put(8,"D");
		hm.putAll(hm1);// put everything of hm1 in hm
		System.out.println(hm);
		
		
		// remove function
		hm.remove(2);//key based removal
		hm.remove(3,"S");//key-value based removal
		System.out.println(hm);
		
		//replace function
		
		hm.replace(1,"K"); // replace value at key 1 with value K
		hm.replace(6,"B","F");//replace value B at key 6 with value F
		System.out.println(hm);
		
		hm.replaceAll((k,v)->"L");// replace all values with L
		System.out.println(hm);
		
		
		System.out.println(hm.keySet());// prints all keys
		System.out.println(hm.values());// prints all values
		System.out.println(hm.entrySet());// prints all key value pairs
		
		//if it contains a key or value

		System.out.println(hm.containsValue("L"));
		System.out.println(hm.containsKey(16));
		
		
		// to print key of specified value
		System.out.println(hm1);
		for(Map.Entry<Integer, String> m : hm1.entrySet()) {
          if(m.getValue().equals("C"))    
          {                          
                System.out.println(m.getKey());
          }
        }
		

	}

}
