package concrete;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFactory() {

		System.getProperty("os.name");

		switch (getOsCode()) {
		case 0:
			return new MacGuiFactory();
		case 1:
			return new LinuxGuiFactory();
		case 2:
			return new WindowGuiFactory();
		}

		return null;
	}

	// 이런 식으로 개발 환경 알아내서 switch문 활용
	private static int getOsCode() {
		if (System.getProperty("os.name").equals("Mac OS X"))
			return 0;
		if (System.getProperty("os.name").equals("Windows 10"))
			return 2;

		return 1;
	}

}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("Linux Button");
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "Linux TextArea";
	}

}

class LinuxGuiFactory implements GuiFactory {

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

///////////////////////////////////////////

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("Mac Button");
	}

}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "Mac TextArea";
	}

}

class MacGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}

////////////////////////////////////////////

class WindowButton implements Button {

	@Override
	public void click() {
		System.out.println("Window Button");
	}

}

class WindowTextArea implements TextArea {

	@Override
	public String getText() {
		return "Window TextArea";
	}

}

class WindowGuiFactory implements GuiFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WindowTextArea();
	}

}
