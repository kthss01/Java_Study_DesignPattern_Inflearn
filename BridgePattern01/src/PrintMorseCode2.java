
// 새로 클래스를 만들었다면 새로 만들어서 상속받아야함
public class PrintMorseCode2 extends MorseCode2 {

//	garam
	public PrintMorseCode2 g() {
		dash();
		dash();
		dot();
		space();
		return this;
	}

	public PrintMorseCode2 a() {
		dot();
		dash();
		space();
		return this;
	}

	public PrintMorseCode2 r() {
		dot();
		dash();
		dot();
		space();
		return this;
	}

	public PrintMorseCode2 m() {
		dash();
		dash();
		space();
		return this;
	}

}
