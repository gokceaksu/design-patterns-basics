package sm523hw3_q3_iterator;

public class FriendsIterator implements Iterator {

	private MyFriendCollection friendCollection;
	private Integer index = 0;
	
	public FriendsIterator(MyFriendCollection friendCollection){
		this.friendCollection = friendCollection;
	}
	
	@Override
	public Object getNext() {
		return friendCollection.myFriends.get(index++);
	}

	@Override
	public Boolean hasNext() {
		return friendCollection.myFriends.size() > index;
	}
}
