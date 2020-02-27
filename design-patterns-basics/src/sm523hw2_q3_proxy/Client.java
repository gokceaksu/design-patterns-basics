package sm523hw2_q3_proxy;

public class Client {
	
	
	public static void main(String[] args) {
		
		Weather w = new ProxyWeather();
		
		//first loaded from the db
		w.showWeather();
		
		//not loaded from the db (cached)
		w.showWeather();
	}

}
