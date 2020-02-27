/**
 * 
 */
package observer;

import java.util.ArrayList;
import java.util.List;

public class OneWorld extends AirlineAlliance {
	
	private List<User> myUsers = new ArrayList<>();
	
	@Override
	public void addUser(User user) {
		myUsers.add(user);
	}
	
	@Override
	public void removeUser(User user) {
		myUsers.remove(user);
	}
	
	@Override
	public void notifyMyUsers(){
		for (User user : myUsers) {
			user.update();
		}
	}

}
