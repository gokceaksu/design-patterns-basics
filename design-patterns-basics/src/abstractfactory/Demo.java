/**
 * 
 */
package abstractfactory;



public class Demo {
	
	
	public static void main(String[] args){
		
		MyUserInterface userInterfaceDark = new MyUserInterface(new DarkThemeUserInterfaceAbstractFactory());
		
		MyUserInterface userInterfaceLight = new MyUserInterface(new LightThemeUserInterfaceAbstractFactory());
		
	}

}
