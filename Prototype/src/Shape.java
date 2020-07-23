
// clone 쓰려면 Cloneable을 implements 해줘야함
public class Shape implements Cloneable {
	
	private String id; 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
