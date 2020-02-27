package sm523hw3_q2_command;

public class RunDryerCommand implements Command{
	
	public Dryer dryer;
	
	public RunDryerCommand(Dryer dryer){
		this.dryer = dryer;
	}

	@Override
	public void execute() {
		dryer.run();
	}

	@Override
	public void undo() {
		//
	}

	@Override
	public Boolean isUndoable() {
		return false;
	}

}
