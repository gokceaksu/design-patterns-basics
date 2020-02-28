package templateMethod;

public class Client {
	
	
	public static void main(String[] args) {
		
		Miner miner = new PDFMiner();
		miner.mineFile("");
		
		Miner miner2 = new DocMiner();
		miner2.mineFile("");
	}
}
