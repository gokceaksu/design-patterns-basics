package proxy;

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
