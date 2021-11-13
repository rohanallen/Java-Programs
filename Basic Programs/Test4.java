package basicStuff;

import java.net.*;
public class Test4  {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress obj1 = InetAddress.getByName("cisco.com");
		InetAddress obj2 = InetAddress.getByName("yahoo.com");
		boolean x = obj1.equals(obj2);
		System.out.print(x);
	
	}
	
}

