import com.kay.dp.AbstGameConnectHelper;
import com.kay.dp.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
	}

}
