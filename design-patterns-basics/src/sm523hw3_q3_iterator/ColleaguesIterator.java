package sm523hw3_q3_iterator;

public class ColleaguesIterator implements Iterator {

	private MyFriendCollection friendCollection;
	private Integer index = 0;
	
	public ColleaguesIterator(MyFriendCollection friendCollection){
		this.friendCollection = friendCollection;
	}
	
	@Override
	public Object getNext() {
		while(!friendCollection.myProfile.getCompanyName().equals(friendCollection.myFriends.get(index).getCompanyName())) {
			index++;
		}
		return friendCollection.myFriends.get(index++);
	}

	@Override
	public Boolean hasNext() {
		return friendCollection.myFriends.size() > index;
	}
}
