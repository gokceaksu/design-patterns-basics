package sm523hw2_q3_proxy;

public class ProxyWeather implements Weather {

	
	RealWeather realWeather;

	@Override
	public void showWeather() {
		
		if(realWeather == null) {
			realWeather = new RealWeather();
		}
		realWeather.showWeather();
	}
}
