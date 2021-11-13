package interThreadCommunication;

public class Test_Bank {

	public static void main(String[] args) {
		Bank obj = new Bank();
		Thread1_Bank t1 = new Thread1_Bank(obj);
		Thread2_Bank t2 = new Thread2_Bank(obj);
		t1.start();// to withdraw
		t2.start();// to deposit
		/* to understand program see output as it is 
		 * then remove wait and notify functions and see output*/

	}

}
