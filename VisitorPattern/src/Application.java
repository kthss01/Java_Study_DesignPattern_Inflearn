import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Visitable> visitableList = new ArrayList<>();

		visitableList.add(new VisitableA(1));
		visitableList.add(new VisitableA(2));
		visitableList.add(new VisitableA(3));
		visitableList.add(new VisitableA(4));
		visitableList.add(new VisitableA(5));
		
		Visitor visitor = new VisitorA();
//		int ageSum = 0;
		
		// for문 돌릴 걸 accept로 처리하는거 
		for (Visitable visitable : visitableList) {
			visitable.accept(visitor);
//			ageSum += ((VisitableA) visitable).getAge();
			// 100줄 자리면 알아보기 힘드니 accept에서 처리
		}
		
		System.out.println(((VisitorA) visitor).getAgeSum());
//		System.out.println(ageSum);
	}

}
