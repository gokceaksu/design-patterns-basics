package sm523hw3_q2_command;

public class Button { //invoker
	
	public Command c;
	
	public void storeCommand(Command c) {
		this.c = c;
	}
	
	public void invoke() {
		c.execute();
	}
	
	public void undo() {
		if(c.isUndoable()) {
			c.undo();
		}	
	}
}
