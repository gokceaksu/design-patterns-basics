package visitor;

public interface Visitor {
	
	
	public void visitElement(Topic topic);
	public void visitElement(Comment comment);
	public void visitElement(Sharing sharing);
}
