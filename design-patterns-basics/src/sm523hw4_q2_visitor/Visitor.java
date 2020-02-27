package sm523hw4_q2_visitor;

public interface Visitor {
	
	
	public void visitElement(Topic topic);
	public void visitElement(Comment comment);
	public void visitElement(Sharing sharing);
}
