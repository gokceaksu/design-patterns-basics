package iterator;

public class MyApp {
	
	public FriendCollection friendCollection;
	
	public void sendMsgToFriends(String msg) {
		Iterator iterator = friendCollection.createFriendsIterator();
		while(iterator.hasNext()) {
			Object profile = iterator.getNext();
			///send message
		}
	}
	
	public void sendMsgToColleages(String msg) {
		Iterator iterator = friendCollection.createColleaguesIterator();
		while(iterator.hasNext()) {
			Object profile = iterator.getNext();
			///send message
		}
	}
}
