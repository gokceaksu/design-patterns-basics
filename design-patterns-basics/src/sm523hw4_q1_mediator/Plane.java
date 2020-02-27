package sm523hw4_q1_mediator;

public class Plane {
	
	Mediator mediator;
	String planeId;
	String planePosition;
	
	public Plane(Mediator mediator) {
		this.mediator = mediator;
	}
	public void takeOff() {
		mediator.planeStateChanged(this, "Take off");
	}
	public void landing() {
		mediator.planeStateChanged(this, "Landing");
	}
	public void landingWithEmergency() {
		mediator.planeStateChanged(this, "Landing with Emergency");
	}
}
