/**
 * 
 */
package abstractfactory;


public class DarkThemeUserInterfaceAbstractFactory implements UserInterfaceAbstractFactory {

	@Override
	public Toolbar createToolbar() {
		return new DarkThemeToolbar();
	}

	@Override
	public Dialog createDialog() {
		return new DarkThemeDialog();
	}

	@Override
	public Panel createPanel() {
		return new DarkThemePanel();
	}

}
