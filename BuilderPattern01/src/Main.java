
public class Main {

	public static void main(String[] args) {

		ComputerFactory factory = new ComputerFactory();

		factory.setBlueprint(new LGGramBlueprint());
//		factory.setBlueprint(new MacAirBlueprint());
//		factory.setBlueprint(new SonyBlueprint());

//		Computer computer = factory.makeAndGet();
		factory.make();
		Computer computer = factory.getComputer();

		// 실제론 굉장히 복잡한 단계로 생성될 수 있음
//		Computer computer = new Computer("i7", "16g", "256g ssd");

		System.out.println(computer.toString());
	}

}
