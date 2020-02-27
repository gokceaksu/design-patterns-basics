/**
 * 
 */
package abstractfactory;



public interface UserInterfaceAbstractFactory {
	
	public Toolbar createToolbar();
	public Dialog createDialog();
	public Panel createPanel();

}
