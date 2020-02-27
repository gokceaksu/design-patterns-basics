package sm523hw3_q2_command;

public class Client {
	
	
	public static void main(String[] args) {
		
		Button turnOnWmButton = new Button();
		WashingMachine wm = new WashingMachine();
		TurnOnWashingMachineCommand turnOnWashingMachineCommand = new TurnOnWashingMachineCommand(wm);
		turnOnWmButton.storeCommand(turnOnWashingMachineCommand);
		
		Button runDryerButton = new Button();
		Dryer dr = new Dryer();
		RunDryerCommand runDryerCommand = new RunDryerCommand(dr);
		runDryerButton.storeCommand(runDryerCommand);
		
		//turnOnWmButton.invoke();
		//runDryerButton.invoke();
	}
}
