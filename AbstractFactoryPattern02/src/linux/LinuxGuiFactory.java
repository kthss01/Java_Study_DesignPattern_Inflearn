package linux;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

//지워야함 다른 곳에서 호출 될 수 없게

public class LinuxGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		//
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
