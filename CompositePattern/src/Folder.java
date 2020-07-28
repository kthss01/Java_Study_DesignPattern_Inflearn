import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

	Folder(String name) {
		super(name);
	}

	List<Component> children = new ArrayList<>();

	public boolean addComponent(Component component) {
		// boolean 리턴 해줘서 이렇게 구현해본 거
		return children.add(component);
	}

	public boolean removeComponent(Component component) {
		// boolean 리턴 해줘서 이렇게 구현해본 거
		return children.remove(component);
	}

	public List<Component> getChildren() {
		return children;
	}
}
