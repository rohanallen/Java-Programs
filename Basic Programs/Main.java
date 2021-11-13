package basicStuff;
import java.util.*; 
public class Main { 
    public static void main(String args[]) throws Exception 
    { 
  
        // Get the ArrayList 
        List<Integer> list = new ArrayList<Integer>(); 
  
        // populate the list 
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
        list.add(in.nextInt()); ;
       
        }
  
        // printing the List 
        System.out.println("List: " + list); 
  
        // getting minimum value 
        // using min() method 
        int minList = Collections.min(list); 
  
        // getting maximum value 
        // using max() method 
        int maxList = Collections.max(list); 
  
        // printing the minimum value 
        System.out.println("Minimum value of list is: "
                           + minList); 
  
        // printing the maximum value 
        System.out.println("Maximum value of list is: "
                           + maxList); 
    } 
} 