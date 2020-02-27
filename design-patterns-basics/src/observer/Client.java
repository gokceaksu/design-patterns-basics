/**
 * 
 */
package observer;


public class Client {
	
	
	public static void main(String[] args){
		
		AirlineAlliance starAlliance = new StarAlliance();
		AirlineAlliance oneWorld = new OneWorld();
		AirlineAlliance skyTeam = new SkyTeam();

		User platinumUser = new PlatinumUser();
		starAlliance.addUser(platinumUser);
		oneWorld.addUser(platinumUser);
		skyTeam.addUser(platinumUser);
		
		User goldUser = new GoldUser();
		starAlliance.addUser(goldUser);
		oneWorld.addUser(goldUser);
		
		User regularUser = new RegularUser();
		starAlliance.addUser(regularUser);
	}
}

