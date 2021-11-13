package patterns;

import java.util.*;

public class Pascals_Triangle {
public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int n= in.nextInt();
		int k=(n-1)*2;
		int number;
		for(int i=0;i<n;i++)
		{
			for(int a=1;a<=k;a++)
			{
				System.out.print(" ");
			}
			k=k-1;
			number=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}

	}

}
