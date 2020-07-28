package concrete;

import abst.AbstAdding;
import abst.IBeverage;

public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;

	public Espresso(IBeverage material) {
		super(material);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + getAddPrice();
	}

	// 에스프레소 추가 가격
	private static int getAddPrice() {
		espressoCount += 1;
		int addPrice = 100;

		if (espressoCount > 1) {
			addPrice = 70;
		}

		return addPrice;
	}

}
