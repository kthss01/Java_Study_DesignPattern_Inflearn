
// interface로 해도 상관없음 만드는 사람에 따라 다름
public class Component {

	private String name;

	Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
