
public class AObj {
	
	// ���⼭ funcAA�� ���� ����� �����Ǿ��ٰ� ����
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		
		// �����Ѵ�.
		ainterface.funcA();
		ainterface.funcA();
		
//		System.out.println("AAA");
//		System.out.println("AAA");

		// ~ ����� �ʿ��մϴ�. ���� ���ּ���
	}
}
