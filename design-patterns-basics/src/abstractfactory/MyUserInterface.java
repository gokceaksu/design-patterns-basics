/**
 * 
 */
package abstractfactory;



public class MyUserInterface {
	
	Toolbar toolbar;
	Dialog dialog;
	Panel panel;
	
	public MyUserInterface(UserInterfaceAbstractFactory abstractFactory){
		
		this.toolbar = abstractFactory.createToolbar();
		this.dialog = abstractFactory.createDialog();
		this.panel = abstractFactory.createPanel();
	}
	
}
