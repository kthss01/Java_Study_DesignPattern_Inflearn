
public class GameCharacter {

	// 접근점
	private Weapon weapon;

	// 교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {
			// 델리게이트
			// 어떤 공격을 들고 있느냐에 따라서 웨폰이 알아서 하는 (위임하는 것)
			weapon.attack();
		}
	}
}
