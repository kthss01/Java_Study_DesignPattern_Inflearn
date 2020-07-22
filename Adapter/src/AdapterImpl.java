
public class AdapterImpl implements Adapter {

	// static으로 했는데 때론 객체가 필요할 수 있음
//	Math math;
	
	@Override
	public Float twiceOf(Float f) {
		
		// math twoTime을 double이라 바로 쓸 수 없어서 float으로 바꿔주는 거
//		return (float) Math.twoTime(f.doubleValue());
		
		// 더 공부 - 새로 구현된 알고리즘 이용하도록 수정
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float) Math.half(f.doubleValue());
	}

}
