
public class Main {

	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImpl();
//		
//		// ����� ����ϴ� ���
//		ainterface.funcA();
//		
//		AObj aObj = new AObj();
//		aObj.funcAA();

		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Axe());
		character.attack();
		
	}

}
