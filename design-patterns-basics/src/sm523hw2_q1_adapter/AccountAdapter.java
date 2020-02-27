package sm523hw2_q1_adapter;

public class AccountAdapter implements Copyable {

	
	public Account adaptee;
	
	public AccountAdapter() {
		this.adaptee = new Account();
	}
	
	@Override
	public Boolean isCopyable() {
		return adaptee.isValid();
	}

}
