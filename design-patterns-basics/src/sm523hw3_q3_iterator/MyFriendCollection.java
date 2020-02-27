package sm523hw3_q3_iterator;

import java.util.ArrayList;
import java.util.List;

public class MyFriendCollection implements FriendCollection {

	public Profile myProfile;
	
	public List<Profile> myFriends = new ArrayList<>();
	
	public Iterator createFriendsIterator() {
		return new FriendsIterator(this);
	}
	
	public Iterator createColleaguesIterator() {
		return new ColleaguesIterator(this);
	}
}
