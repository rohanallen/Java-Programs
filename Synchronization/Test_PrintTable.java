package synchronization;

public class Test_PrintTable {

	public static void main(String[] args) {
		Print_Table obj = new Print_Table();// to create a single object obj of Print_Table class
		
		// creates Thread1 ref t1 and passes obj to thread 1
		// make sure same object is used for synchronized keyword to work
		Thread_1_Print_Table t1 = new Thread_1_Print_Table(obj);
		Thread_2_Print_Table t2 = new Thread_2_Print_Table(obj);
		
		// t1s job is to to print multiplication table of 7
		t1.start();// starts execution of thread 1 and only starts execution of thread2 after its job is completed
		
		// t2s job is to to print multiplication table of 100
		t2.start();
		
		//remove synchronized keyword in printTable function to see diff in output
		/*if i create another object obj1 of print_Table class and pass it 
		 * thru thread 2 synchronization will not work and 
		 * t1 and t2 will execute paralelly as synchronization does not
		 * apply to threads of 2 diff objects. That is why in this case
		 * we should use keyword synchronized static void printTable.
		 * now synchronization will occur
		 * 
		 */
		
	}

}
