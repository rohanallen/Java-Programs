package collections;
// read priya g generic classes notes
public class Generic_Method { 
		  
		   public static < E > void printArray(E[] elements) {  // E denotes object type defined by user
		        for ( E element : elements){          
		            System.out.println(element );  
		         }  
		         System.out.println();  
		    }  
		    public static void main( String args[] ) {  
		        Integer[] intArray = { 10, 20, 30, 40, 50 };  
		        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
		  
		        System.out.println( "Printing Integer Array" );  
		        printArray( intArray  );   
		  
		       System.out.println( "Printing Character Array" );  
		        printArray( charArray );   
		    }   
		}  


