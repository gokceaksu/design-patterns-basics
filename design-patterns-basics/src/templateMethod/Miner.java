package templateMethod;

public abstract class Miner {
	
	//template method
	public final void mineFile(String filename) {
		openFile(filename);
		extractData();
		parseData();
		analyze();
		saveResults();
	}
	
	public abstract void openFile(String fileName);
	public abstract void extractData();
	public abstract void parseData();

	public void analyze() {
		//same
	}
	public void saveResults() {
		//same
	}
}
