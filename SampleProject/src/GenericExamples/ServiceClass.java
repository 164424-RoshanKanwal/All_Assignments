package GenericExamples;

public class ServiceClass {

	public static void main(String[] args) {
		
	MyList<BankAccount> list = new MyList<BankAccount>();	
	
	BankAccount acc = new BankAccount(1, "Roshan");
	BankAccount acc1 = new BankAccount(2, "Roshani");
	//list.add(acc.getAccount()  + " " + acc.getName());
	list.add(acc);
	//list.get(0);
	list.remove(acc);
	list.add(acc1);
		
	
	
	/*MyList<Employee> list2 = new MyList<Employee>();
	Employee e = new Employee(11, "Rahul");*/
	}
}
