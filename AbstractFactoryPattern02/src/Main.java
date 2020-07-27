import abst.Button;
import abst.GuiFactory;
import abst.TextArea;
import concrete.FactoryInstance;

public class Main {
	
	public static void main(String[] args) {
		
		GuiFactory factory = FactoryInstance.getGuiFactory();
		
		// linux mac window 이런거 외부에 노출되면 안됨
//		GuiFactory factory = new LinuxGuiFactory();
//		GuiFactory factory = new MacGuiFactory();
//		GuiFactory factory = new WindowGuiFactory();
		
		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();
		
		button.click();
		System.out.println(textArea.getText());
		
		System.out.println(System.getProperty("os.name"));
	}
}
