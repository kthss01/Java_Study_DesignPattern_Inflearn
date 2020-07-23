
public class SystemSpeaker {
	
	private static SystemSpeaker instance;
	private int volume;
	
	// 생성자는 private으로
	private SystemSpeaker() {
		volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {
			// 시스템 스피커
			// 실제로 통신하는 작업을 여기 넣어줘야함
			instance = new SystemSpeaker();
			System.out.println("새로 생성");
		}
		else {
			System.out.println("이미 생성");
		}
		
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
