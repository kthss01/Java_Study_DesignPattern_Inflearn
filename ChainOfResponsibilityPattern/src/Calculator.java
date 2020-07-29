
public abstract class Calculator {

	private Calculator nextCalculator;
	private Calculator prevCalculator;

	protected void setNextCalculator(Calculator nextCalculator) {
		this.nextCalculator = nextCalculator;

	}

	protected void setPrevCalculator(Calculator prevCalculator) {
		this.prevCalculator = prevCalculator;

	}

	public boolean process(Request request) {

		if (operator(request)) {
			// =
			return true;
		} else if (nextCalculator != null) {
			return nextCalculator.process(request);
		}
		return false;
	}

	public boolean prevProcess(Request request) {

		if (prevCalculator != null)
			if (prevCalculator.process(request))
				return true;

		return operator(request);

	}

	// 동작
	abstract protected boolean operator(Request request);
}
