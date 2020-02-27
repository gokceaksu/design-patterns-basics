package sm523hw2_q4_flyweight;

public class Player {
	
	ParticleFlyweightFactory particleFlyweightFactory;
	
	public void fire(Player player) {
		
		ParticleFlyweight p = particleFlyweightFactory.getParticle("bullet.img");
		
		p.draw("", 1, 50);
		
	}

}
