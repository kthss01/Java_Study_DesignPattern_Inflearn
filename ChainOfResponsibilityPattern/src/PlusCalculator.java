
public class PlusCalculator extends Calculator {

	@Override
	protected boolean operator(Request request) {
		if (request.getOperator().equals("+")) {
			int a = request.getA();
			int b = request.getB();

			int result = a + b;

			System.out.printf("a + b = %d\n", result);
		}
		return false;
	}

}
