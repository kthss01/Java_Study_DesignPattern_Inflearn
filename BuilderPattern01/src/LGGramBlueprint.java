
// ConcreteBuilder
public class LGGramBlueprint extends Blueprint {

	private Computer computer;
	// 이거 말고는 아예 Computer의 cpu, ram, storage를 가지고 있을 수도 있음
//	private String cpu;
//	private String ram;
//	private String storage;

	public LGGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i7");
//		cpu = "i7";
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
//		ram = "8g";
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g ssd");
//		storage = "256g ssd";
	}

	@Override
	public Computer getComputer() {
		return computer;
//		return new Computer(cpu, ram, storage);
	}

}
