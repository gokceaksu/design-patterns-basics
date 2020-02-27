package sm523hw3_q2_command;

public class TurnOnWashingMachineCommand implements Command{
	
	public WashingMachine washingMachine;
	
	public TurnOnWashingMachineCommand(WashingMachine washingMachine){
		this.washingMachine = washingMachine;
	}

	@Override
	public void execute() {
		washingMachine.turnOn();
	}

	@Override
	public void undo() {
	}

	@Override
	public Boolean isUndoable() {
		return true;
	}
}
