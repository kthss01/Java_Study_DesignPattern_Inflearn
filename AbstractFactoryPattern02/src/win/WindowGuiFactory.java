package win;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

//지워야함 다른 곳에서 호출 될 수 없게

public class WindowGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WindowTextArea();
	}

}
