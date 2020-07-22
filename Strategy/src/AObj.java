
public class AObj {
	
	// 여기서 funcAA에 대한 기능이 구현되었다고 가정
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		
		// 위임한다.
		ainterface.funcA();
		ainterface.funcA();
		
//		System.out.println("AAA");
//		System.out.println("AAA");

		// ~ 기능이 필요합니다. 개발 해주세요
	}
}
