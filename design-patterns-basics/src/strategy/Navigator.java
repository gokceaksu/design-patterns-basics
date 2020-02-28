package strategy;

public class Navigator {
	
	
	RouteStrategy routeStrategy;
	
	public void setStrategy(RouteStrategy str) {
		this.routeStrategy = str;
	}
	
	public void executeNavi() {
		
		routeStrategy.buildRoute();
	}

}
