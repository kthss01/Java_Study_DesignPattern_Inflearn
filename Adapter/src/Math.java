
public class Math {
	
	// double로 되어있어서 float 요구사항과 맞지 않음
	// 두 배
	public static double twoTime(double num) {
		return num * 2;
	}

	// 절반
	public static double half(double num) {
		// 이렇게 하면 안됨 라이브러리 형태로 여러 곳에 배포되었기 때문
//		System.out.println("half 함수 호출");
		return num / 2;
	}

	// 강화된 알고리즘
	public static Double doubled(Double d) {
		return d * 2;
	}
}
