package GenericExamples;

public class BankAccount {

	private int account;
	private String name;
	
	public BankAccount(int account, String name) {
		super();
		this.account = account;
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
