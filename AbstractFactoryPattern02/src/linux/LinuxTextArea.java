package linux;

import abst.TextArea;

//지워야함 다른 곳에서 호출 될 수 없게

public class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "Linux TextArea";
	}

}
