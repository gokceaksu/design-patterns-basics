package sm523hw2_q5_bridge;

public abstract class ItemCollection {
	
	
	public String name;
	public String id;
	public String price;
	public Integer quantity;
	
	public DisplayAPI display;
	
	public void setDisplay(DisplayAPI display) {
		this.display = display;
	}
	
	public abstract void display(ItemCollection itemCollection);
	
}
