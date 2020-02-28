package visitor;

import java.util.Date;

public abstract class Element {
	
	public String author;
	public String text;
	public Date creationTime;
	
	public abstract void acceptVisitor(Visitor v);
}
