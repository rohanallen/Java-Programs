package interThreadCommunication;

public class Thread1_Bank extends Thread {
	
		Bank ref;
		public Thread1_Bank(Bank ref)
		{
			this.ref=ref;
		}
		public void run()
		{
			ref.withdraw(12000);
		}

}

