package mac;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

//지워야함 다른 곳에서 호출 될 수 없게

public class MacGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}
