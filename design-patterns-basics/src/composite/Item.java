package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
	
	
	List<Item> children = new ArrayList<>();
	
	public abstract Integer getScore();
	
	
	public void addChild(Item item) {
		children.add(item);
	}
	
	public void removeChild(Item item) {
		children.remove(item);
	}
	
	public Item getChild(Integer index) {
		return children.get(index);
	}
}
