package composite;

public class TreasureChest extends Item {
	
	
	public Integer getScore() {
		
		Integer totalScore = 0;
		for (Item item : children) {
			totalScore += item.getScore();
		}
		return totalScore;
	}
}
