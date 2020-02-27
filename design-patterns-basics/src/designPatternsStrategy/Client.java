package designPatternsStrategy;

public class Client {
	
	
	public static void main(String[] args) {
		
		Navigator navi = new Navigator();
		
		navi.setStrategy(new PublicTransportStrategy());
		
		navi.executeNavi();
		
	}

}
