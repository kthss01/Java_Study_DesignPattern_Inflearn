
public class Main {
	public static void main(String[] args) {
		
//		SystemSpeaker speaker = new SystemSpeaker(); // (X)
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		// 동일한 인스턴스라는 거 확인
		// 디버깅해보면 주소값이 같음
		// 5, 5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());

		speaker1.setVolume(11);
		// 11, 11
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker2.setVolume(22);
		// 22, 22
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
	}
}
