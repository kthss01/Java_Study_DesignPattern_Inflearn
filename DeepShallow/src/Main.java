
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));

		// 얕은 복사 : 주소값 복사
		Cat yo = navi;
		// 깊은 복사
		yo = navi.copy();
		yo.setName("yo");
//		yo.setAge(new Age(2013, 2)); // 이때도 문제 없음
		
		// 이렇게하면 깊은 복사가 일어나지 않았음
		// Cat 클래스에서 copy에서 명시적으로 해주면됨
		yo.getAge().setYear(2013);
		yo.getAge().setValue(2);

		System.out.println(navi.getName());
		System.out.println(yo.getName());

		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
	}

}
