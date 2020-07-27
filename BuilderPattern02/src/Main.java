
public class Main {

	public static void main(String[] args) {

		// 이렇게 인자를 잘못 넣어줄 수 있음 (인자가 엄청 많다고 가정할 때)
		// document를 잘 적어두면 괜찮을 수 잇기는 함 그래도 많아지면 실수 할 수 있음
//		Computer computer = new Computer("256g ssd", "i7", "8g");

		// 체이닝 기법으로 만듬
		// 메소드로 가독성을 더 높일 수 있게됨
		Computer computer = ComputerBuilder
				.startWithCpu("i8")
//				.start()
//				.setCpu("i7")
				.setRam("8g")
//				.setStorage("256g ssd") // 이렇게 빠져도 default라 상관없음
				.build();
		
		System.out.println(computer.toString());
	}

}
