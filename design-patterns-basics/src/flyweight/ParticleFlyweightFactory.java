package flyweight;

import java.util.HashMap;

public class ParticleFlyweightFactory {///Game
	
	HashMap<String, ParticleFlyweight> particleCache = new HashMap<>();
	
	public ParticleFlyweight getParticle(String imgName) {
		
		if(particleCache.containsKey(imgName)) {
			return particleCache.get(imgName);
		}
		else {
			ParticleFlyweight particle = new ParticleFlyweight(imgName);
			particleCache.put(imgName, particle);
			return particle;
		}
	}
	
	public void draw(String location, Integer direction, Integer speed, String imgName) {
		
		if(particleCache.containsKey(imgName)) {
			particleCache.get(imgName).draw(location, direction, speed);
		}
	}
}

