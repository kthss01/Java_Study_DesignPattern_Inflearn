
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle1 = new Circle(1, 1, 0.5);
		Circle circle2 = circle1.copy();
		System.out.println(
				circle1.getX() + "," + 
			    circle1.getY() + "," +
				circle1.getRadius());
		System.out.println(
				circle2.getX() + "," + 
			    circle2.getY() + "," +
				circle2.getRadius());
	}
}
