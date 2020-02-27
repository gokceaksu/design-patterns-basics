package sm523hw2_q5_bridge;

public class Client {
	
	public static void main(String[] args) {
		
		ItemCollection itemCollection = new ConcreteItemCollection();
		
		itemCollection.setDisplay(new DataGridTableDisplay());
		itemCollection.display(itemCollection);
		
		itemCollection.setDisplay(new ListBoxDisplay());
		itemCollection.display(itemCollection);
		
	}
}
