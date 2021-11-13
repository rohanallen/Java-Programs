package numberPrograms;

// print all the prime no in a given range
import java.util.*;

public class Prime_Number_Advanced {
	int n;
	boolean isPrime;
    public void printPrime(int a, int b) {
		for (int i = a; i <= b; i++) {
			isPrime(i);
		}
	}

	public void isPrime(int num) {
		isPrime=true;// initialize isPrime is true inside
		n = num;
		if (num == 0 || num == 1) {
			isPrime = false;
		}
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)// checking if isPrime=true
		{
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number 1 ");
		int a = in.nextInt();
		System.out.println("Enter Number 2");
		int b = in.nextInt();
		Prime_Number_Advanced obj = new Prime_Number_Advanced();
		obj.printPrime(a,b);

	}
}
