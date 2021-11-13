package numberPrograms;

// program to check if number is prime
/*Brief Description: i initially initialize isPrime as true and then check if num is 
 * composite and then equate it to false this is much easier. if i enter 0,1,2,3 they 
 * will not go inside the loop that is why i explicitly stated 0 and 1 are not
 * prime whereas 2,3 no problem because they are prime and by default isPrime variable
 * is true. i took i<=n/2 as no number is divisible by a number more than half itself
 * therefore no point searching till i<n*/
import java.util.*;

class Prime_Number {
	int n;
	boolean isPrime;

	public void isPrime(int num) {
		n = num;
		isPrime=true;
		if (num == 0 || num == 1) {
			isPrime = false;
		}
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;// gets out of the loop no point checking further
			}
		}
		if (isPrime)// checking if isPrime=true
		{
			System.out.println(num + " is a Prime Number.");
		} else {
			System.out.println(num + " is not a Prime Number.");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Prime_Number obj = new Prime_Number();
		obj.isPrime(a);

	}
}
