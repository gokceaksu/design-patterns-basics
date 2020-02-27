package sm523hw4_q1_mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements Mediator {

	
	List<Plane> planes = new ArrayList<>();

	@Override
	public void planeStateChanged(Plane plane, String state) {
		//mediator logic, it will control the plane actions.
	}
}
