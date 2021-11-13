// for Rohan Allen print R.A
package stringShit;
import java.util.*;
public class Print_Initials {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		s=s.trim();
		String arr[] = s.split(" ");
		int l=arr.length;
		for(int i=0;i<l;i++)
		{
			if(i==l-1)
			{
			System.out.print(arr[i].charAt(0));
			}
			else
				System.out.print(arr[i].charAt(0)+".");
		}
}

}
