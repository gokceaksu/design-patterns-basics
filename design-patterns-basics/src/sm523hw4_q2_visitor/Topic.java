package sm523hw4_q2_visitor;

public class Topic extends Element {

	
	@Override
	public void acceptVisitor(Visitor v) {
		v.visitElement(this);
	}
}
