package interThreadCommunication;

public class Thread2_Bank extends Thread {
Bank ref;
public Thread2_Bank(Bank ref)
{
	this.ref=ref;
}
public void run()
{
	ref.deposit(5000);
}
}
