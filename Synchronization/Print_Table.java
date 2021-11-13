package synchronization;

public class Print_Table {
synchronized void printTable(int n)// synchronized keyword means when one thread accquires the lock until it finishes no other thread can unlock it
{
	for(int i=1;i<=10;i++)// to print multiplication table
	{
		System.out.println(n*i);
	}
}
}
