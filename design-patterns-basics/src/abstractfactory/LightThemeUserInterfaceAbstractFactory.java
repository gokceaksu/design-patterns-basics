/**
 * 
 */
package abstractfactory;


public class LightThemeUserInterfaceAbstractFactory implements UserInterfaceAbstractFactory {

	@Override
	public Toolbar createToolbar() {
		return new LightThemeToolbar();
	}

	@Override
	public Dialog createDialog() {
		return new LightThemeDialog();
	}

	@Override
	public Panel createPanel() {
		return new LightThemePanel();
	}

}
