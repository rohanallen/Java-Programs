// caesar cipher which adds 13 to a char(ex a->n)
package stringShit;
import java.util.*;
public class Caesar_Cipher {
	String b="";
	int a =0;
	char ch=' ';
	public void caesar(String s,int l)
	{
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(Character.isLetter(ch))
			{
				a=(int)ch+13;
			
				if(Character.isUpperCase(ch)&&a>90||Character.isLowerCase(ch)&&a>122)
				{
				a=a-26;
				
				}
				ch=(char)a;
			}
			b=b+ch;
		}
		System.out.println("Caesar Cipher is "+ b);
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		int l = s.length();
		Caesar_Cipher obj = new Caesar_Cipher();
		obj.caesar(s,l);
}
}
