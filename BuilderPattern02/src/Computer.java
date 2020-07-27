
// 설계에서 Director
public class Computer {

	private String cpu;
	private String ram;
	private String storage;

/**
 * 
 * @param cpu cpu입니다.
 * @param ram 램입니다.
 * @param storage 저장소입니다.
 */
	
	public Computer(String cpu, String ram, String storage) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return cpu + "," + ram + "," + storage;
	}
}
