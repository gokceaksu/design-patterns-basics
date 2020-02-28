package composite;

public class Client {
	
	public static void main(String[] args) {
		
		Item item1 = new SilverCoin();
		Item item2 = new GoldCoin();
		Item item3 = new Diamond();
		
		Item chest1 = new TreasureChest();
		chest1.addChild(item1);
		chest1.addChild(item2);
		
		Item chest2 = new TreasureChest();
		chest2.addChild(chest1);
		chest2.addChild(item3);
		
		chest2.getScore();
	}
}

