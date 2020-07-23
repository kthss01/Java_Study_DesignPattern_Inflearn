
public class Circle extends Shape {

	private int x, y;
	private double radius;

	public Circle(int x, int y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		
		circle.x += 1;
		circle.y += 1;
		
		return circle;
	}
}
