/*Write a Java Program to print half pyramid using alphabets
A
B B
C C C
D D D D
E E E E E
*/
package patterns;
import java.util.*;
public class Alphabet_Pyramid {
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner in = new Scanner(System.in);
System.out.println("Enter Row Number");
int n= in.nextInt();
int code=65;
for(int i=1;i<=n;i++)
{
	for(int j=1; j<=i;j++)
	{
		System.out.print((char)code+" ");
	}
	code=code+1;
	System.out.println();
}
		

	}

}
