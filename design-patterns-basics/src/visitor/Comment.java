package visitor;

public class Comment extends Element {

	
	@Override
	public void acceptVisitor(Visitor v) {
		v.visitElement(this);
	}

}
