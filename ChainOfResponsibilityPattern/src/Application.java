
public class Application {

	public static void main(String[] args) {

		Calculator plus = new PlusCalculator();
		Calculator minus = new MinusCalculator();

//		plus.setNextCalculator(minus);
		plus.setPrevCalculator(minus);

		Request request1 = new Request(1, 2, "+"); // 3
		Request request2 = new Request(10, 2, "-"); // 8

//		plus.process(request1);
//		plus.process(request2);
		
		plus.prevProcess(request1);
		plus.prevProcess(request2);

	}
}
