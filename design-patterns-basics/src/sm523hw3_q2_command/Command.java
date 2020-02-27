package sm523hw3_q2_command;

public interface Command {
	
	
	public void execute();
	public void undo();
	public Boolean isUndoable();
}
