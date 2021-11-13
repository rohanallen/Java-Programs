package basicStuff;

import java.util.Scanner;
import java.util.*;
public class Regex
{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		String s = Integer.toString(a);
		if(a<100&&a>999)
		{
			System.out.println(false);
		}
		else
		{
			String k="";
			int sum=0;
			int len=s.length();
			k =k+s.charAt(0);
			k=k+s.charAt(len-1);
			int n=Integer.parseInt(k);
			if(a%n==0)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
			
		}
        }


}

