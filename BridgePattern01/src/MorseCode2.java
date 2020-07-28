
/*
 * 모스부호는 dash dot space 가 필요함
 */

// 실제 소리로 바꾼다고 가정하면 여기서 다시 수정하거나 새로 만들어야함

public class MorseCode2 {
	
	public void dot() {
		System.out.print("·");
//		System.call.shortBip();
	}
	public void dash() {
		System.out.print("-");
//		System.call.longBip();
	}
	public void space() {
		System.out.print(" ");
//		System.call.longTick(); // 이런게 있다고 가정
	}
}
