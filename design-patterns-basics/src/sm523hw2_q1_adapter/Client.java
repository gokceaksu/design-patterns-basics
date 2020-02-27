package sm523hw2_q1_adapter;

import java.util.Vector;

public class Client {
	
	public static void main(String[] args) {
		
		Copyable accountAdapter1 = new AccountAdapter();
		Copyable accountAdapter2 = new AccountAdapter();
		
		Vector<Copyable> vector = new Vector<>();
		vector.add(accountAdapter1);
		vector.add(accountAdapter2);
		
		Utility utility = new Utility();
		utility.copy(vector);
		
	}
}

