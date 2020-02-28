package visitor;

public class Sharing extends Element {

	
	@Override
	public void acceptVisitor(Visitor v) {
		v.visitElement(this);
	}

}
