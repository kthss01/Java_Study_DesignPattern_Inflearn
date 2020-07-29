
public class Armor implements Defense {
	
	private Defense nextDefense;
	private int def;

	public Armor(int def) {
		this.def = def;
	}

	@Override
	public void defense(Attack attack) {
		
		// 중요한 부분 바로 첫번째 예제와 다르게 바로 처리할 수 있음
		// 하나의 객체만 책임을 지지 않아도 됨 여러 객체가 책임을 질 수 있음
		process(attack);
		
		if(nextDefense != null) {
			nextDefense.defense(attack);
		}
		
	}
	
	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -= def;
		attack.setAmount(amount);
	}
	
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
}
