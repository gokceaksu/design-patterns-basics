/**
 * 
 */
package observer;


public abstract class AirlineAlliance { ///subject of interest
	
	
	public abstract void addUser(User user);
	
	public abstract void removeUser(User user);
	
	public abstract void notifyMyUsers();

}

