package visitor;

public class Client {
	
	
	public static void main(String[] args) {
		
		Topic topic = new Topic();
		Comment comment = new Comment();
		Sharing sharing = new Sharing();
		
		Visitor elementCounterVisitor = new ElementCounterVisitor();
		topic.acceptVisitor(elementCounterVisitor);
		comment.acceptVisitor(elementCounterVisitor);
		sharing.acceptVisitor(elementCounterVisitor);
		
		Visitor authorCounterVisitor = new AuthorCounterVisitor();
		topic.acceptVisitor(authorCounterVisitor);
		comment.acceptVisitor(authorCounterVisitor);
		sharing.acceptVisitor(authorCounterVisitor);
	}
}
