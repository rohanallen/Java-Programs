package basicStuff;
import java.util.*;
public class Hello {
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	String s=in.nextLine();
	int n=in.nextInt();
	String k="";
	int sum=0;
	int len=s.length();
	if(n>len)
		System.out.println(-1);
	else {
		for(int i=n-1; i<len;i=i+n)
		{
			k=k+s.charAt(i);
		}
		
		int a=Integer.parseInt(k);
		while(a!=0)
		{
			
			sum=sum+(a%10);
			a=a/10;
		}
		System.out.println(sum);
		
	}
	
}
}
