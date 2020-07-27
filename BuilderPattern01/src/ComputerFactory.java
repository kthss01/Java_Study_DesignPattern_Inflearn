
public class ComputerFactory {
	
	private Blueprint blueprint;
	
	public void setBlueprint(Blueprint blueprint) {
		this.blueprint = blueprint;
	}

	// makeAndGet 함수를 쓰기도함
	public void make() {
		blueprint.setCpu();
		blueprint.setRam();
		blueprint.setStorage();
	}
	
	public Computer getComputer() {
		return blueprint.getComputer();
	}
}
