package basicStuff;
/*Java StringBuffer class is used to create mutable (modifiable)
 *  string. The StringBuffer class in java is same as String class
 *   except it is mutable i.e. it can be changed.
 *   Note: Java StringBuffer class is thread-safe i.e.
 *    multiple threads cannot access it simultaneously.
 *     So it is safe and will result in an order.*/
import java.util.*;
@SuppressWarnings("unused")
public class String_Buffer_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// understood everything except capacity method
		
		StringBuffer sb = new StringBuffer();// creates empty object sb of string buffer class(can store 16 characters)
		
		System.out.println(sb.capacity());// 16(default capacity)
		
		sb.append("Hello World");//(add string to sb object)
		
		System.out.println(sb.capacity());//16(still 16 as no of char in sb is now 11(<16)
		
		// once char in sb is more than 16 the capacity of sb increases to (16*2)+2
		
		sb.append("Javafx");// no of char in sb is now17(>16)
		
		System.out.println(sb.capacity());//34(old capacity*2)+2 and so on
		
		
		sb.ensureCapacity(10);// checks if sb has min capacity of 10(it does)
		
		System.out.println(sb.capacity());//prints 34 only as it does have min capacity of 10
		
		sb.ensureCapacity(50);// checks if sb has min capacity of 50(it doesnt)
		
		System.out.println(sb.capacity());//prints 70 (34*2)=2 only as it doesnt have min capacity of 50
		
		
		// read ensure capacity(it takes in int argument) from priya g
		// Read Priya G notes for everything else
		/* other functions are
		 * sb.append(String)
		 * sb.insert(from,to)//index
		 * sb.replace(from,to)
		 * sb.delete(from,to)
		 * sb.reverse()
		 * sb.ensureCapacity(int capacity)
		 */
	}

}
