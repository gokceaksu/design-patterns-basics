package visitor;

public class Topic extends Element {

	
	@Override
	public void acceptVisitor(Visitor v) {
		v.visitElement(this);
	}
}
